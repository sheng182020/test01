package demo.Test02_1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerTCP {
    public static void main(String[] args) throws IOException {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        System.out.println("服务端启动，等待连接····");
        ServerSocket ss=new ServerSocket(6666);
        Socket server=ss.accept();
        executorService.submit(new Thread(new Runnable() {
            @Override
            public void run() {
                InputStream is=null;
                while(true){
                    try {
                        is= server.getInputStream();
                        byte[] b=new byte[1024];
                        int len=is.read(b);
                        String msg=new String(b,0,len);
                        if(msg=="end"){
                            if(is!=null){
                                try {
                                    is.close();
                                    server.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }

                            }
                            return;
                        }
                        System.out.println(msg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }));

        executorService.submit(new Thread(new Runnable() {
            @Override
            public void run() {
                OutputStream os=null;
                while(true){
                    String str=new Scanner(System.in).nextLine();
                    if(str=="end"){
                        if(os!=null){
                            try {
                                os.close();
                                server.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                        }
                        return;
                    }
                    try {
                        os=server.getOutputStream();
                        os.write((str+"\n").getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }

            }
        }));


    }
}

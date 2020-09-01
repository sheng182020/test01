package day20.Test06;

import java.io.*;
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
                BufferedReader is=null;
                String msg=null;
                while(true){
                    try {
                        is= new BufferedReader(new InputStreamReader(server.getInputStream()));
                        msg=is.readLine();

                        System.out.println(msg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }finally {
                        if("exit".equals(msg)){
                            if(is!=null){
                                try {
                                    is.close();
                                    server.close();
                                    System.exit(1);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }

                            }
                            return;
                        }
                    }
                }
            }
        }));

        executorService.submit(new Thread(new Runnable() {
            @Override
            public void run() {
                BufferedWriter os=null;
                while(true){
                    String str=new Scanner(System.in).nextLine();

                    try {
                        os=new BufferedWriter(new OutputStreamWriter(server.getOutputStream()));
                        os.write(str);
                        os.newLine();
                        os.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }finally {
                        if("exit".equals(str)){
                            if(os!=null){
                                try {
                                    os.flush();
                                    os.close();
                                    server.close();
                                    System.exit(1);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }

                            }
                            return;
                        }
                    }

                }

            }
        }));


    }
}

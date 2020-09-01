package demo.Test02_1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTCP {
    public static void main(String[] args) throws Exception {
        System.out.println("客户端 发送数据");
        Socket client=new Socket("localhost",6666);
        new Thread(new Runnable() {
            @Override
            public void run() {
                OutputStream os=null;
                while(true){
                    String str=new Scanner(System.in).nextLine();
                    if(str=="end"){
                        if(os!=null){
                            try {
                                os.close();
                                client.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                        }
                        return;
                    }
                    try {
                        os=client.getOutputStream();
                        os.write((str+"\n").getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                InputStream is=null;
                while(true){
                    try {
                        is=client.getInputStream();
                        byte[] b=new byte[1024];
                        int len=is.read(b);
                        String msg=new String(b,0,len);
                        if(msg=="end"){
                            if(is!=null){
                                try {
                                    is.close();
                                    client.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }

                            }
                            return;
                        }
                        System.out.println("收到信息："+msg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        }).start();

    }
}

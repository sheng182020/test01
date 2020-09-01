package day20.Test06;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientTCP {
    public static void main(String[] args) throws Exception {
        System.out.println("客户端 发送数据");
        Socket client=new Socket("localhost",6666);
        new Thread(new Runnable() {
            @Override
            public void run() {
                BufferedWriter os=null;
                while(true){
                    String str=new Scanner(System.in).nextLine();
                    try {
                        os=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
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
                                    client.close();
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
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                BufferedReader is=null;
                String msg = null;
                while(true){
                    try {
                        is= new BufferedReader(new InputStreamReader(client.getInputStream()));
                        msg=is.readLine();
                        System.out.println("收到信息："+msg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }finally {
                        if("exit".equals(msg)){
                            if(is!=null){
                                try {
                                    is.close();
                                    client.close();
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
        }).start();

    }
}

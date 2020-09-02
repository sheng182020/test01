package day20.Test08;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientOu {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\a\\a.txt"));
        Socket socket = new Socket("localhost", 6666);

        new Thread(new Runnable() {
            @Override
            public void run() {
                BufferedWriter os=null;
                BufferedReader bis=null;
                while(true){
                    System.out.println("请输入账号密码（格式：账号=密码）");
                    String str=new Scanner(System.in).nextLine();
                    try {
                        os=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                        os.write(str);
                        os.newLine();
                        os.flush();

                        System.out.println("输入完毕");
                        bis= new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        socket.shutdownOutput();
                        String s=bis.readLine();
                        System.out.println(s);
                        if(s.equals("密码正确，登录成功")){
                            os.close();
                            socket.close();
                            bis.close();
                            break;
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }

            }
        }).start();


    }
}

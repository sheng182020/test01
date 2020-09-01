package day20.Test08;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.Set;

public class ServerIn {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器 启动..... ");
        ServerSocket serverSocket = new ServerSocket(6666);
        Properties pro=new Properties();

        while (true) {
            Socket accept = serverSocket.accept();
            new Thread(() -> {
                BufferedReader bis=null;
                BufferedWriter os=null;
                String msg=null;
                int i=0;
                try  {
                    bis= new BufferedReader(new InputStreamReader(accept.getInputStream()));
                    os=new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
                    String[] arr=bis.readLine().split("=");
                    pro.load(new FileInputStream("D:\\a\\a.txt"));
                    Set<String> strings=pro.stringPropertyNames();
                    for (String s : strings) {
                        if(s.equals(arr[0])){
                            if(arr[1].equals(pro.getProperty(s))){
                                os.write("密码正确，登录成功");
                                os.flush();
                                return;
                            }else{
                                os.write("密码错误");
                                os.flush();
                            }
                        }else{
//                            i++;
//                            if (i==strings.size()-2){
//                                os.write("用户不存在");
//                                os.flush();
//                                pro.setProperty(arr[0],arr[1]);
//                                os.write("注册成功");
//                                os.flush();
//                            }
                            os.write("用户不存在");
                            os.flush();
                            pro.setProperty(arr[0],arr[1]);
                            os.write("注册成功");
                            os.flush();
                        };
                    }
                    os.flush();
                    os.close();
                    bis.close();
                    accept.close();
                    System.out.println(1);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}

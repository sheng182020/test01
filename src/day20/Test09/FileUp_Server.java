package day20.Test09;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileUp_Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器 启动..... ");
        ServerSocket serverSocket = new ServerSocket(6666);
        while(true){
            Socket accept = serverSocket.accept();
            new Thread(() -> {
                BufferedInputStream bis = null;
                try {
                    bis = new BufferedInputStream(new FileInputStream("D:\\a\\a.txt"));
                    BufferedOutputStream bos = new BufferedOutputStream(accept.getOutputStream());
                    byte[] b = new byte[1024 * 8 ];
                    int len ;
                    while (( len = bis.read(b))!=-1) {
                        bos.write(b, 0, len);
                    }
                    accept.shutdownOutput();
                    System.out.println("文件发送完毕");
                    InputStream in = accept.getInputStream();
                    byte[] back = new byte[20];
                    in.read(back);
                    System.out.println(new String(back));
                    in.close();
                    accept.close();
                    bis.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }).start();

        }
    }
}

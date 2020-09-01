package day20;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test04 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8888);
        System.out.println("服务端开启，等待用户连接：");
        Socket server=serverSocket.accept();
        InputStream is=server.getInputStream();
        byte[] bytes=new byte[1024];
        int len = is.read(bytes);
        String msg = new String(bytes, 0, len);
        System.out.println(msg);
        server.close();
        is.close();
    }
}

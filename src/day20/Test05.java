package day20;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Test05 {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端 发送数据");
        Socket client=new Socket("localhost",8888);
        OutputStream os=client.getOutputStream();
        os.write("hello.服务器,我是客户端".getBytes());
        os.flush();
        os.close();
        client.close();
    }
}

package day20.Test09;

import java.io.*;
import java.net.Socket;

public class FileUp_Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 6666);
        try (
                BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
                FileOutputStream fis = new FileOutputStream("D:\\"+System.currentTimeMillis() + ".txt");
                BufferedOutputStream bos = new BufferedOutputStream(fis);
        ) {
            byte[] b = new byte[1024 * 8];
            int len;
            while ((len = bis.read(b)) != -1) {
                bos.write(b, 0, len);
            }
            System.out.println("back ........");
            OutputStream out = socket.getOutputStream();
            out.write("下载成功".getBytes());
            out.close();
            bos.close();
            bis.close();
            socket.close();
            System.out.println("文件已保存");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

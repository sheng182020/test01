package day17;

import java.io.*;

public class Test06 {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\CCC\\b.txt");
        File f=new File("D:\\CCC");

        if(!file.exists()){
            f.mkdirs();
            file.createNewFile();
        }
        BufferedWriter bw=new BufferedWriter(new FileWriter(file));
        bw.write("在c盘aaa文件夹中创建一个b.txt文件并输入数据\n");
        bw.flush();
        System.out.println("文件相对路径："+file.getCanonicalPath());
        System.out.println("文件绝对路径:"+file.getAbsolutePath());
        System.out.println("文件构造路径:"+file.getPath());
        System.out.println("文件名称:"+file.getName());
        System.out.println("文件长度:"+file.length()+"字节");
        if(file.exists()){
            if (file.isFile()){
                BufferedReader br=new BufferedReader(new FileReader(file));
                String s=null;
                while((s=br.readLine())!=null){
                    System.out.println(s);
                }
            }
        }

    }
}

package demo.Test03_1;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Set;

public class Demo1 {

    public static void main(String[] args){
        Student stu=(Student) createObject();
        System.out.println(stu);
    }

    private static Object createObject() {
        try{
            Properties pro=new Properties();
            File file=new File("stu.properties");
            System.out.println(file.getAbsolutePath());
            pro.load(Demo1.class.getResourceAsStream("/stu.properties"));
            pro.load(new FileInputStream("D:\\java\\demo\\stu.properties"));
            String className=pro.getProperty("class");
            Class c=Class.forName(className);
            Object obj=c.newInstance();
            Set<String> names=pro.stringPropertyNames();
            for (String name : names) {
                if(name.equals("class")){
                    continue;
                }
                String vlaue=pro.getProperty(name);
                Field f=c.getDeclaredField(name);
                f.setAccessible(true);
                Class typeClass=f.getType();
                if(typeClass==int.class){
                    f.setInt(obj,Integer.parseInt(vlaue));
                }else{
                    f.set(obj,vlaue);
                }
            }
            return obj;

        } catch (Exception  e) {
            throw new RuntimeException(e);
        }

    }
}

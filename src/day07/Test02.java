package day07;

public class Test02 {
    public static void main(String[] args) {
        String str1="hello";
        String str2=new String("hello");
        String str3="Hello";
        String str4="hello";
        System.out.println("str1和str2内容是否相等："+str1.equals(str2));
        System.out.println("str1和str3内容是否相等："+str1.equals(str3));
        System.out.println("忽略大小写比较Str1和str3内容是否相等："+str1.equalsIgnoreCase(str3));
        System.out.println("str1字符串是都以He前缀开头："+str1.startsWith("He"));
        System.out.println("str1字符串是都以abc前缀开头："+str1.startsWith("abc"));
        System.out.println("str1字符串是都以o后缀结尾："+str1.endsWith("o"));
        System.out.println("str1字符串是都以l后缀结尾："+str1.endsWith("l"));
    }
}

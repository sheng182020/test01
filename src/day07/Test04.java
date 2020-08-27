package day07;

public class Test04 {
    public static void main(String[] args) {
        String str="HelloWorld";
        char[] chs=str.toCharArray();
        for(Object o:chs){
            System.out.println(o);
        }
        System.out.println("将sre字符串转换为小写："+str.toLowerCase());
        System.out.println("将str字符串转换为大写："+str.toUpperCase());
        System.out.println("将str字符串中的字符'o'替换成'6'："+str.replace('o','6'));
        System.out.println("将str字符串中的字符串ll替换成LL:"+str.replace("ll","LL"));
    }
}

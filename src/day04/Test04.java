package day04;

public class Test04 {
    public static void main(String[] args) {
        char aChar=getChar(100);
        System.out.println("字符:"+aChar);
    }
    public static char getChar(int num){
        char ch=(char)num;
        if(num>48||num<57){
            return ch;
        }else if(num>65||num<90){
            return ch;
        }else if(num>97||num<122){
            return ch;
        }else{
            return ' ';
        }
    }
}

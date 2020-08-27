package day14.Test01_2.com.xiaomi.leve1_6;

public class Test06 {
    public static void main(String[] args) throws Exception {
        System.out.println(charAt("",0));
        testThrows();
        testTryCatch();
    }
    public static char charAt(String str,int index){
        if(str==null){
            throw new NullPointerException("字符串不能为null");
        }else if(str==""){
            throw new NullPointerException("字符串不能为null");

        }else if(index<0|index>str.length()-1){
            throw new ArrayIndexOutOfBoundsException("索引越界了");
        }
        return str.charAt(index);
    }
    public static void testThrows() throws Exception{
        charAt("ss",4);
    }
    public static void testTryCatch(){
        try {
            charAt("hhh",8);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

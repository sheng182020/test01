package demo01;

public class Test02 {
    public static void main(String[] args) {
        int y=0;
        for(int i=0;i<100;i++){
            if(i%2!=0){
                y+=i;
//                System.out.println(i);
            }
        }
        System.out.println(y);
    }
}

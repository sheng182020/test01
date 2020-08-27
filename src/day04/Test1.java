package day04;

public class Test1 {
    public static void main(String[] args) {
        int[] arr={12,33,25,6,16};
        int min=arr[0];
        for(int i:arr){
            if(i<min){
                min=i;
            }
        }
        System.out.println(min);
    }
}

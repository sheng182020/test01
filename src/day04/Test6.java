package day04;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,3,2,1};
        System.out.print(Arrays.toString(arr));
        getArr(arr);
    }
    public static void getArr(int[] arr){
        for(int start=0,end=arr.length-1;start<=end;start++,end--){
            if (arr[start]!=arr[end]){
                System.out.println("是否对称： false");
                return;
            }
        }
        System.out.println("是否对称：true");
    }
}

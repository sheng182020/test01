package day04;

import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {
        int[] arr1=new int[]{1,2,3,4,3,2,1};
        int[] arr2=new int[]{1,2,3,4,3,2,1};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        equals(arr1,arr2);
    }
    public static void equals(int[] arr1,int[] arr2){
        if(arr1.length==arr2.length){
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    System.out.println("是否一致：flase");

                }
            }
            System.out.println("是否一致：true");
        }
    }
}

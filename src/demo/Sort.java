package demo;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr={7,8,5,4,9};
        printArr(arr);
        sortTwo(arr);
        printArr(arr);
    }
    public static void change(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void printArr(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sortOne(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    change(arr,i,j);
                }
            }
        }
        return arr;
    }
    public static int[] sortTwo(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]) {
                    change(arr,j,j+1);
                }
            }
        }
        return arr;
    }
    public static int[] sortThree(int[] arr){
        for(int i=0;i<arr.length-1;i++){        //比较次数
            int num=arr[i];
            int index=i;
            for (int j=i+1;j<arr.length;j++){
                if (num>arr[j]) {
                    num=arr[j];
                    index=j;
                }
            }
            if(i!=index){
                change(arr,i,index);
            }
        }
        return arr;
    }
}

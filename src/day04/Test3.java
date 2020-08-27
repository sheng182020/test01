package day04;

public class Test3 {
    public static void main(String[] args) {
        int[] nums=new int[]{5,10,15};
        int[] newArr=new int[nums.length];
        System.out.println("num数组：");
        for(int i=0;i<nums.length;i++){
            newArr[i]=nums[i]*2;
            System.out.print(nums[i]+"\t");
        }
        System.out.println();
        System.out.println("newArr新数组：");
        for(int j:newArr){
            System.out.print(j+"\t");
        }
    }
}

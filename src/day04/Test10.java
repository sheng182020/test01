package day04;

public class Test10 {
    public static void main(String[] args) {
        int[] result={99,100,98,97,96};
        int min=result[0];
        int max=result[0];
        int a=0;
        int b=0;
        for(int i=0;i<result.length;i++){
            if (min>result[i]){
                min=result[i];
                a=i;
            }
            if(max<result[i]){
                max=result[i];
                b=i;
            }
        }
        int Score=0;
        for(int i:result){
            Score+=i;
        }
        Score=(Score-result[a]-result[b])/(result.length-2);
        System.out.println("最终得分："+Score);
    }
}

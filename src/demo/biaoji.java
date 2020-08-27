package demo;

public class biaoji {
    public static void main(String[] args) {
        test01:for(int i=1;i<=3;i++){
            test02:for(int j=1;j<=3;j++){
                if (i==2) continue test01;
            }
        }
    }
}

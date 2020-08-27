package day14.Test01_2.com.xiaomi.leve1_7;

public class Student {
    private String name;
    private int score;

    public Student() {
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score<0) {
            throw new NoScoreException("分数不能为负数："+score);
        }else{
            this.score = score;
        }
    }
}

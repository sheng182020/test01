package day12.Tset02.test1;

class Student{
    int score;
    private String name;
    private int age;

    public Student() {
    }

    public Student( String name, int age,int score) {
        this.score = score;
        this.name = name;
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

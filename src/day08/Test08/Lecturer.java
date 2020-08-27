package day08.Test08;

class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(int id, String name) {
        super(id, name);
    }
    @Override
    public void work(){
        System.out.println("工号为："+getId()+"  的讲师  "+getName()+" 在讲课");
    }
}

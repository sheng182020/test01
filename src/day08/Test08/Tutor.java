package day08.Test08;

class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(int id, String name) {
        super(id, name);
    }
    @Override
    public void work(){
        System.out.println("工号为："+getId()+" 的助教 "+getName()+" 在帮助学生解决问题");
    }
}

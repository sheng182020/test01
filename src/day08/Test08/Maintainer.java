package day08.Test08;

class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(int id, String name) {
        super(id, name);
    }
    @Override
    public void work(){
        System.out.println("工号为："+getId()+" 的维护专员 "+getName()+" 在解决不能共享屏幕问题");
    }

}

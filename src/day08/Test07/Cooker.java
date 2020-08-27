package day08.Test07;

class Cooker extends Employee{
    public Cooker() {
    }

    public Cooker(String id, String name, float salary) {
        super(id, name, salary);
    }
    @Override
    public void work(){
        System.out.println("工号为："+getId()+",姓名为："+getName()+",工资为："+getSalary()+"的厨师在工作，炒菜");
    }
    @Override
    public void eat(){
        System.out.println("工号为："+getId()+",姓名为："+getName()+",工资为："+getSalary()+"的厨师在吃肉");
    }
}

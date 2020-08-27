package day08.Test07;

class Manager extends Employee{
    public Manager() {
    }

    public Manager(String id, String name, float salary) {
        super(id, name, salary);
    }
    @Override
    public void work(){
        System.out.println("工号为："+getId()+",姓名为："+getName()+",工资为："+getSalary()+"的经理在工作，管理其他人");
    }
    @Override
    public void eat(){
        System.out.println("工号为："+getId()+",姓名为："+getName()+",工资为："+getSalary()+"的经理在吃鱼");
    }
}

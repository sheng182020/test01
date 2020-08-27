package day08.Test08;

class Buyer extends AdminStaff{
    public Buyer() {
    }

    public Buyer(int id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("工号为："+getId()+" 的采购专员 "+getName()+" 在采购音响设备");
    }
}

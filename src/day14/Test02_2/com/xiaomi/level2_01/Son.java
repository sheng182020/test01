package day14.Test02_2.com.xiaomi.level2_01;

public class Son extends Father{
    //(a)
//    @Override
//    public void eat() throws TonguePainException {
//        System.out.println("牙疼");
//    }
    //(b)
//    @Override
//    public void eat() throws PainExecption {
//        System.out.println("牙疼");
//    }
    //(c)
//    @Override
//    public void eat() throws ToothPainException {
//        System.out.println("牙疼");
//    }
//    (d)
//    @Override
//    public void eat() throws BigToothPainException {
//        System.out.println("牙疼");
//    }
    //(e)
//    @Override
//    public void eat() throws BigToothPainException,FrontToothExtion{
//        System.out.println("牙疼");
//    }
    //(f)
//    @Override
//    public void drink() throws ToothPainException {
//        System.out.println("牙疼");
//    }

    @Override
    public void drink() throws FrontToothExtion {
//        System.out.println("喝到了100度的水");
        try {
            System.out.println("喝到了100度的水");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

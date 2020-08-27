package day14.Test02_2.com.xiaomi.level2_03;

public class Test {
    public static void main(String[] args) {
        try {
//            login("admi","admin");
//            login("admin","admi");
            login("admin","admin");
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
    public static void login(String name,String pwd) throws LoginException {
        if (name!="admin"){
            throw new LoginException("用户名不存在");
        }else{
            if(pwd!="admin"){
                throw new LoginException("密码错误");
            }else{
                System.out.println("欢迎光临！");
            }
        }
    }
}

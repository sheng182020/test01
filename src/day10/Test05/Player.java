package day10.Test05;

public class Player{
    public FightAble select(String str){
        if(str.equals("法力角色")){
//            new Mage().specialFight();
//            new Mage().commonFight();
            return (new Mage());
        }else if(str.equals("武力角色")){
//            new Warrior().specialFight();
//            new Warrior().commonFight();
            return new Warrior();
        }else{
            return null;

        }

    }
}

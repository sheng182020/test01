package day10.Test05;

interface FightAble {
    void specialFight();
    public default void commonFight(){
        System.out.println("普通打击");
    }
}

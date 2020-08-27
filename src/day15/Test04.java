package day15;

public class Test04 {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i+"播放音乐");
                }
            }
        }.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i+"显示画面");
                }
            }
        }).start();
    }
}

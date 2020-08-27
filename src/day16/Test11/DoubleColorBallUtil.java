package day16.Test11;

import java.util.Arrays;
import java.util.Random;

public class DoubleColorBallUtil {
    public static String create(){
        String[] red=new String[33];
        for (int i = 1; i <=33; i++) {
            red[i-1]=String.valueOf(i);
        }
        String[] blue="01,02,03,04,05,06,07,08,09,10,11,12,13,14,15,16".split(",");
        boolean[] used=new boolean[red.length];
        Random r=new Random();
        String[] all=new String[7];
        for (int i = 0; i < 6; i++) {
            int idx;
            do {
                idx=r.nextInt(red.length);
            }while (used[idx]);
            used[idx]=true;
            all[i]=red[idx];
        }
        all[all.length-1]=blue[r.nextInt(blue.length)];
        Arrays.sort(all);
        return Arrays.toString(all);
    }
}

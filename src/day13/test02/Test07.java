package day13.test02;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        char[] chars= str.toCharArray();
        for (char c : chars) {
            linkedHashSet.add(String.valueOf(c));
        }
        System.out.println(linkedHashSet);
    }
}

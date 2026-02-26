package kyu8.ExpressionsMatter;

import java.util.ArrayList;

public class Kata {
    public static int expressionsMatter(int a, int b, int c) {
        int mulit = a * b * c;
        int addi = a + b + c;
        int firstaddi = (a + b) * c;
        int secoendaddi = a * (b + c);
        int max = 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(mulit);
        list.add(addi);
        list.add(firstaddi);
        list.add(secoendaddi);
        for (Integer i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}

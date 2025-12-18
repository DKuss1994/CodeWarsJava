package kyu7.XO;

public class XO {

    public static boolean getXO(String str) {
        int x = 0;
        int o = 0;
        char xChar = 'x';
        char oChar = 'o';
        str = str.toLowerCase();
        char[] strChar = str.toCharArray();
        for (char c : strChar) {
            if (c == xChar) {
                x++;
            }
            if (c == oChar) {
                o++;
            }
        }
        return x - o == 0;

    }
}

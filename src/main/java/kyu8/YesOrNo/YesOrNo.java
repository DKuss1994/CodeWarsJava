package kyu8.YesOrNo;

class YesOrNo
{

    public static String boolToWord(boolean b) {
        // We check the parameter and return yes or no-
        if(b){
            return "Yes";
        }
        else {
            return "No";
        }
    }
    public static String boolToWordLambda(boolean b){
        String no = "no";
        String yes = "Yes";
        return b ? yes : no;
    }

}

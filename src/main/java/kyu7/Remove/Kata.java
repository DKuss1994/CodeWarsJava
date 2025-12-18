package kyu7.Remove;

public class Kata {
    public static String removeUrlAnchor(String url) {
        int index = url.indexOf('#');
        if (index == -1) {
            return url;
        } else {
            StringBuilder newLink = new StringBuilder();
            char[] urlCharArray = url.toCharArray();
            for (int i = 0; i < index; i++) {
                newLink.append(urlCharArray[i]);
            }
            return newLink.toString();
        }
    }
    public static String removeUrlSplit (String url){
        return url.split("#")[0];
    }
}
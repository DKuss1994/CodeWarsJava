package kyu6.Persist;


class Persist {
    public static int persistence(long n) {
        int count = 0;
        final char TONUMBER = '0';
        String valueString = String.valueOf(n);
        while (valueString.length() != 1) {
            int value = 1;
            char[] valueCharArray = valueString.toCharArray();
            valueString = multiplicativeTheValue(valueCharArray, value, TONUMBER);
            count++;
        }

        return count;
    }

    private static String multiplicativeTheValue(char[] valueCharArray, int value, char TONUMBER) {
        String valueString;
        for (int i = 0; i < valueCharArray.length; i++) {
            value *= (valueCharArray[i] - TONUMBER);
        }
        valueString = String.valueOf(value);
        return valueString;
    }


}

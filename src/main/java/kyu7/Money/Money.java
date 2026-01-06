package kyu7.Money;

public class Money {
    public static int calculateYears(double principal, double interest,
                                     double tax, double desired) {
        double zins;
        int years = 0;
        if (principal == desired) {
            return years;
        }

        while (principal<desired){
            zins = (principal*interest)*(1-tax);
            principal+=zins;
            years++;
        }

        return years;
    }
}
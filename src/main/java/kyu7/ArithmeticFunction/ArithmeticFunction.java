package kyu7.ArithmeticFunction;


//5, 2, "add"      --> 7
//5, 2, "subtract" --> 3
//5, 2, "multiply" --> 10
//5, 2, "divide"   --> 2.5
class ArithmeticFunction {
    public static int arithmetic(int a, int b, String operator) {
        if(operator.equals("add")){
            return a+b;
        }
        return 5;
    }
}
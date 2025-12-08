package kyu7.ArithmeticFunction;

class ArithmeticFunction {
    public static int arithmetic(int a, int b, String operator) {
        if (operator.equals("add")) {
            return a + b;
        } else if (operator.equals("subtract")) {
            return a - b;
        } else if (operator.equals("multiply")) {
            return a * b;

        } else if (operator.equals("divide")) {
            return a / b;

        }
        return 0;
    }

    public static int arithmeticSwitch(int a, int b, String operator) {
        switch (operator) {
            case "add":
                return a + b;

            case "subtract":
                return a - b;

            case "multiply":
                return a * b;

            case "divide":
                return a / b;


        }
        return a;
    }
}
package kyu8.Multiplication_table;

class Kata {
    public static String multiTable(int num) {
        StringBuilder x = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            x.append(i).append(" * ").append(num).append(" = ").append(i * num);
            if(i==10){
                break;
            }
            x.append(System.lineSeparator());

        }
        System.out.println(x.toString());
        return x.toString(); // good luck
    }
}
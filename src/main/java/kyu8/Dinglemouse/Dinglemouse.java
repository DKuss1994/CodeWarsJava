package kyu8.Dinglemouse;

public class Dinglemouse {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int human = humanYears;
        int cat = 15;
        int dog = 15;
        if(humanYears>=2){
            cat+=9;
            dog+=9;
            }

            for (int i = 2; i < humanYears; i++) {
                cat += 4;
                dog += 5;

        }
        return new int[]{human, cat, dog};
    }
}

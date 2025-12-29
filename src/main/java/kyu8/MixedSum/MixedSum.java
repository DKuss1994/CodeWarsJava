package kyu8.MixedSum;

import java.util.List;


public class MixedSum {

    public static int sum(List<?> mixed) {
         return mixed.stream().map(Object::toString).mapToInt(Integer::parseInt).sum();

    }
}
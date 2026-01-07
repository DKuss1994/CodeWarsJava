package kyu6.Solution;


import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution{

    public static int solveSuperMarketQueue (int[] customers, int n) {
        PriorityQueue<Integer> kassen = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            kassen.add(0);
        }
        for (int customer : customers) {
            int frei = kassen.poll();
            frei += customer;
            kassen.add(frei);
        }
        return kassen.stream().max(Integer::compareTo).get();
    }
    public static int solveSuperMarketQueueSort (int[] customers, int n){
        int[] kasse = new int[n];
        for (int i = 0; i < customers.length; i++) {
            kasse[0] += customers[i];
            Arrays.sort(kasse);
        }
        return kasse[n-1];

    }

}

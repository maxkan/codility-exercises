package lesson1.ex3;

/**
 * Created by Max on 3/25/2015.
 */
public class Solution {

    public int solution(int[] a) {
        boolean isValid = new SolutionValidator().isValid(a);
        if (!isValid) {
            throw new IllegalArgumentException();
        }

        int prev = 0;
        int[] lSums = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            lSums[i] = prev + a[i];
            prev = lSums[i];
        }

        prev = 0;
        int[] rSums = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            rSums[i] = prev + a[i];
            prev = rSums[i];
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < a.length; i++) {
            int diff = Math.abs(lSums[i-1] - rSums[i]);
            if (diff < min) {
                min = diff;
            }
        }

        return min;
    }

    public static class SolutionValidator {

        public boolean isValid(int[] a) {
            if (a == null) {
                return false;
            }
            if (a.length < 2 || a.length > 100000) {
                return false;
            }
            return true;
        }
    }
}

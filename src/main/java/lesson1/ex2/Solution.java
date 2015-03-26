package lesson1.ex2;

/**
 * Created by Max on 3/23/2015.
 */
public class Solution {

    public int solution(int[] a) {
        validate(a);

        markExisting(a);
        return getNotMarked(a);
    }

    private int getNotMarked(int[] a) {
        int i = 0;
        for (; i < a.length; i++) {
            if (a[i] != -1) {
                return i + 1;
            }
        }
        return i + 1;
    }

    private void markExisting(int[] a) {
        for (int i = 0; i < a.length; i++) {
            replace(a, i);
        }
    }

    private void replace(int[] a, int startI) {

        int i = a[startI] -1;
        while (i >= 0 && i < a.length) {
            int nextI = a[i] - 1;
            a[i] = -1;
            i = nextI;
        }
    }

    private void validate(int[] a) {
        boolean isValid = new SolutionValidator().validate(a);
        if (!isValid) {
            throw new IllegalArgumentException();
        }
    }

    static class SolutionValidator {

        public boolean validate(int[] a) {
            if (a == null) {
                return false;
            }
            return true;
        }
    }
}

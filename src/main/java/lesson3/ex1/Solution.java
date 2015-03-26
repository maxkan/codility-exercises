package lesson3.ex1;

/**
 * Created by Max on 3/26/2015.
 */
public class Solution {

    public int solution(int[] a) {
        boolean isValid = validate(a);
        if (!isValid) {
            throw new IllegalArgumentException();
        }

        int numEast = 0;
        int pairsCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                pairsCount += numEast;

                if (pairsCount > 1000000000) {
                    return -1;
                }
            }
            if (a[i] == 0) {
                numEast++;
            }
        }

        return pairsCount;
    }

    private boolean validate(int[] a) {
        if (a == null || a.length < 1 || a.length > 100000) {
            return false;
        }

        return true;
    }
}

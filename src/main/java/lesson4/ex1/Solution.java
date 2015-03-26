package lesson4.ex1;

import java.util.Arrays;

/**
 * Created by Max on 3/26/2015.
 */
public class Solution {

    public int solution(int[] a) {
        boolean isValid = validate(a);
        if (!isValid) {
            throw new IllegalArgumentException();
        }

        Arrays.sort(a);

        int candidateFromMin = a[0] * a[1] * a[a.length - 1]; //can be 2 negative in the beginning

        int candidateFromMax = a[a.length - 1] * a[a.length - 2] * a[a.length - 3];
        return candidateFromMax > candidateFromMin ? candidateFromMax : candidateFromMin;
    }

    private boolean validate(int[] a) {
        if (a == null || a.length < 3 || a.length > 100000) {
            return false;
        }

        return true;
    }

}

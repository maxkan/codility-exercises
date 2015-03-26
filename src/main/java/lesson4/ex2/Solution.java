package lesson4.ex2;

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

        if (a.length < 2) {
            return a.length;
        }

        Arrays.sort(a);

        int count = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                count++;
            }
        }
        return count+1;
    }

    private boolean validate(int[] a) {
        if (a == null || a.length > 100000) {
            return false;
        }

        return true;
    }
}

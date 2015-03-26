package lesson2.ex2;

/**
 * Created by Max on 3/26/2015.
 */
public class Solution {

    public int solution(int x, int[] a) {
        boolean isValid = validate(x, a);
        if (!isValid) {
            throw new IllegalArgumentException();
        }

        int uniquePositions = 0;
        boolean[] leavesFallen = new boolean[x];

        for (int i = 0; i < a.length; i++) {
            int fallPosition = a[i] - 1;
            if (fallPosition < leavesFallen.length) {
                if (leavesFallen[fallPosition] == false) {
                    leavesFallen[fallPosition] = true;
                    uniquePositions++;
                    if (uniquePositions == x) {
                        return i;
                    }
                }
            }
        }

        return -1;
    }

    private boolean validate(int x, int[] a) {
        if (x < 1 || x > 100000) {
            return false;
        }

        if (a == null || a.length < 1 || a.length > 100000) {
            return false;
        }
        return true;
    }
}

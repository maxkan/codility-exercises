package lesson2.ex1;

/**
 * Created by Max on 3/26/2015.
 */
public class Solution {

    int solution(int a[]) {
        validate(a);

        boolean[] availabilityArray = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            int index = a[i]-1;
            if (index >= availabilityArray.length || availabilityArray[index] == true) {
                return 0;
            }
            availabilityArray[index] = true;
        }

        for (int i = 0; i < availabilityArray.length; i++) {
            if (!availabilityArray[i]) {
                return 0;
            }
        }

        return 1;
    }

    private void validate(int[] a) {
        if (a == null) {
            throw new IllegalArgumentException();
        }

        if (a.length < 1 || a.length > 100000) {
            throw new IllegalArgumentException();
        }
    }
}

package ex1;

/**
 * Created by Max on 3/23/2015.
 */
public class Solution {

    public int solution(int X, int Y, int D) {
        validate(X, Y, D);

        return (int) Math.ceil((Y - X) / (double) D);
    }

    private void validate(int X, int Y, int D) {
        boolean isValid = new SolutionValidator().validate(X, Y, D);
        if (!isValid) {
            throw new IllegalArgumentException();
        }
    }

    static class SolutionValidator {

        private static final int MAX = 1000000000;

        public boolean validate(int x, int y, int d) {
            if (x < 1 || y < 1 || d < 1) {
                return false;
            }
            if (y < x) {
                return false;
            }

            if (x > MAX || y > MAX || d > MAX) {
                return false;
            }
            return true;
        }
    }
}

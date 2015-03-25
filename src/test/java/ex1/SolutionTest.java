package ex1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testSimpleInput() {
        int numJumps = new Solution().solution(1, 11, 10);
        assertEquals(numJumps, 1);
    }

    @Test
    public void testAlreadyThere() {
        int numJumps = new Solution().solution(10, 10, 1);
        assertEquals(numJumps, 0);
    }

    @Test
    public void testLessThanOneStep() {
        int numJumps = new Solution().solution(10, 11, 8);
        assertEquals(numJumps, 1);
    }

    @Test
    public void testExactOneSteps() {
        int numJumps = new Solution().solution(10, 20, 10);
        assertEquals(numJumps, 1);
    }

    @Test
    public void testExactTwoSteps() {
        int numJumps = new Solution().solution(10, 20, 5);
        assertEquals(numJumps, 2);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testExceptionIfNotValidInput() {
        new Solution().solution(0, 1, 1);
    }


}
package lesson2.ex2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {

    @Test
    public void testOnePositionZeroMinute() {
        int solution = new Solution().solution(1, new int[]{1});

        Assert.assertSame(solution, 0);
    }

    @Test
    public void testTwoPositions1stMinute() {
        int solution = new Solution().solution(2, new int[]{1,2});

        Assert.assertSame(solution, 1);
    }

    @Test
    public void testTwoPositionsNeverCross() {
        int solution = new Solution().solution(2, new int[]{1,1});

        Assert.assertSame(solution, -1);
    }

    @Test
         public void testThreePositionsFourthMinute() {
        int solution = new Solution().solution(3, new int[]{1,1,2,3});

        Assert.assertSame(solution, 3);
    }

    @Test
    public void testFivePositionsTenthMinute() {
        int solution = new Solution().solution(5, new int[]{1,1,2,3,4,1,3,1,3,10,5});

        Assert.assertSame(solution, 10);
    }


    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testValidateXIsTooSmall() throws Exception {
        new Solution().solution(0, new int[]{1});
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testValidateXIsTooBig() throws Exception {
        new Solution().solution(100001, new int[]{1});
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testValidateAIsNull() throws Exception {
        new Solution().solution(10, null);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testValidateAIsEmpty() throws Exception {
        new Solution().solution(10, new int[]{});
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testValidateAIsTooLarge() throws Exception {
        new Solution().solution(10, new int[100001]);
    }
}
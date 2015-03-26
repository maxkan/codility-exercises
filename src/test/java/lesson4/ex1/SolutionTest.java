package lesson4.ex1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testValidateAIsNull() throws Exception {
        new Solution().solution(null);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testValidateAIsEmpty() throws Exception {
        new Solution().solution(new int[]{});
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testValidateAIsTooSmall() throws Exception {
        new Solution().solution(new int[2]);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testValidateAIsTooLarge() throws Exception {
        new Solution().solution(new int[100001]);
    }


    @Test
         public void testSolutionOnly3() throws Exception {
        int solution = new Solution().solution(new int[]{1, 2, 3});

        assertSame(solution, 6);
    }

    @Test
    public void testSolution4ReverseOrder() throws Exception {
        int solution = new Solution().solution(new int[]{4, 3, 2, 1});

        assertSame(solution, 24);
    }

    @Test
    public void testSolution4MixedOrder() throws Exception {
        int solution = new Solution().solution(new int[]{2, 3, 1, 4});

        assertSame(solution, 24);
    }

    @Test
    public void testSolutionWithNegatives() throws Exception {
        int solution = new Solution().solution(new int[]{-2, -3, 1, 2, 4});

        assertSame(solution, 24);
    }
}
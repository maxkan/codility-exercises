package lesson2.ex1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertSame;

public class SolutionTest {

    @Test
    public void testOneElementSolution() throws Exception {
        int solution = new Solution().solution(new int[]{1});

        assertSame(solution, 1);
    }

    @Test
    public void testTwoElementsPermutationOrdered() throws Exception {
        int solution = new Solution().solution(new int[]{1, 2});

        assertSame(solution, 1);
    }

    @Test
    public void testTwoElementsPermutationUnordered() throws Exception {
        int solution = new Solution().solution(new int[]{2, 1});

        assertSame(solution, 1);
    }

    @Test
    public void testThreeElementsPermutationUnordered() throws Exception {
        int solution = new Solution().solution(new int[]{2, 1, 3});

        assertSame(solution, 1);
    }

    @Test
    public void testTwoElementsNoPermutation() throws Exception {
        int solution = new Solution().solution(new int[]{1, 3});

        assertSame(solution, 0);
    }

    @Test
    public void testThreeElementsNoPermutationUnordered() throws Exception {
        int solution = new Solution().solution(new int[]{2, 1, 4});

        assertSame(solution, 0);
    }
}
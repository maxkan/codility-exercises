package lesson4.ex2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testSolutionOneElement() throws Exception {
        int solution = new Solution().solution(new int[]{1});

        assertSame(solution, 1);
    }

    @Test
    public void testSolutionTwoSameElements() throws Exception {
        int solution = new Solution().solution(new int[]{1,1});

        assertSame(solution, 1);
    }

    @Test
    public void testSolutionTwoDistinctElements() throws Exception {
        int solution = new Solution().solution(new int[]{1,1,2});

        assertSame(solution, 2);
    }

    @Test
    public void testSolutionFiveDistinctElementsOutOf10() throws Exception {
        int solution = new Solution().solution(new int[]{1,1,2,3,2,3,4,5,2,5});

        assertSame(solution, 5);
    }
}
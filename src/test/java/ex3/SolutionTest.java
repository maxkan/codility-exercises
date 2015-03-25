package ex3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testDiffIsOneAndFirstIsLess() throws Exception {
        int solution = new Solution().solution(new int[]{1,2});
        assertSame(solution, 1);
    }

    @Test
    public void testDiffIsOneAndFirstIsBigger() throws Exception {
        int solution = new Solution().solution(new int[]{2,1});
        assertSame(solution, 1);
    }

    @Test
    public void testDiffIsZero() throws Exception {
        int solution = new Solution().solution(new int[]{1,1});
        assertSame(solution, 0);
    }

    @Test
    public void testDiffFrom3() throws Exception {
        int solution = new Solution().solution(new int[]{1,3,-2});
        assertSame(solution, 0);
    }

    @Test
    public void testDiffFrom5() throws Exception {
        int solution = new Solution().solution(new int[]{3,1,2,4,3});
        assertSame(solution, 1);
    }
}
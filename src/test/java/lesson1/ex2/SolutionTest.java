package lesson1.ex2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testSingleElement() {
        int missing = new Solution().solution(new int[]{1});
        assertSame(missing, 2);
    }

    @Test
    public void testFirstOfThreeIsMissing() {
        int missing = new Solution().solution(new int[]{2,3});
        assertSame(missing, 1);
    }

    @Test
    public void testLastOfThreeIsMissing() {
        int missing = new Solution().solution(new int[]{1,2});
        assertSame(missing, 3);
    }

    @Test
    public void testMiddleOfThreeIsMissing() {
        int missing = new Solution().solution(new int[]{3,1});
        assertSame(missing, 2);
    }

    @Test
    public void testMiddleOfFourIsMissing() {
        int missing = new Solution().solution(new int[]{2,3,1,5});
        assertSame(missing, 4);
    }

}
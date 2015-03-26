package lesson3.ex1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertSame;

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
    public void testValidateAIsTooLarge() throws Exception {
        new Solution().solution(new int[100001]);
    }

    @Test
    public void test1PassingPair() {
        int solution = new Solution().solution(new int[]{0, 1});

        assertSame(solution, 1);
    }

    @Test
    public void testNoPassingPair1CarEast() {
        int solution = new Solution().solution(new int[]{0});

        assertSame(solution, 0);
    }

    @Test
    public void testNoPassingPair1CarWest() {
        int solution = new Solution().solution(new int[]{1});

        assertSame(solution, 0);
    }

    @Test
    public void testNoPassingPair2CarsEast() {
        int solution = new Solution().solution(new int[]{0, 0});

        assertSame(solution, 0);
    }

    @Test
    public void testNoPassingPair2CarsWest() {
        int solution = new Solution().solution(new int[]{1, 1});

        assertSame(solution, 0);
    }

    @Test
    public void testTwoPassingPairsOneEastTwoWest() {
        int solution = new Solution().solution(new int[]{0, 1, 1});

        assertSame(solution, 2);
    }

    @Test
    public void testTwoPassingPairsALotOfEastInTheEnd() {
        int solution = new Solution().solution(new int[]{0, 1, 1, 0, 0});

        assertSame(solution, 2);
    }

    @Test
    public void testTwoPassingPairsALotOfWestInTheBeginning() {
        int solution = new Solution().solution(new int[]{1, 1, 0, 1, 1});

        assertSame(solution, 2);
    }

    @Test
         public void testTwoPassingPairsALotOfWestInTheBeginningAndEastInTheEnd() {
        int solution = new Solution().solution(new int[]{1, 1, 0, 1, 1, 0, 0});

        assertSame(solution, 2);
    }

    @Test
    public void test5Cars5PassingPairs() {
        int solution = new Solution().solution(new int[]{0, 0, 1, 0, 1});

        assertSame(solution, 5);
    }
}

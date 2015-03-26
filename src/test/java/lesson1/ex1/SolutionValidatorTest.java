package lesson1.ex1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

public class SolutionValidatorTest {

    public static final int MAX = 1000000000;

    @Test
    public void testXLessThan1() {
        boolean isValid = new Solution.SolutionValidator().validate(0, 1, 2);
        assertFalse(isValid);
    }

    @Test
    public void testYLessThan1() throws Exception {
        boolean isValid = new Solution.SolutionValidator().validate(1, 0, 2);
        assertFalse(isValid);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDLessThan1() throws Exception {
        boolean isValid = new Solution.SolutionValidator().validate(1, 2, 0);
        assertFalse(isValid);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testYIsLessThanX() throws Exception {
        boolean isValid = new Solution.SolutionValidator().validate(2, 1, 1);
        assertFalse(isValid);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testXIsGreaterThanMax() {
        boolean isValid = new Solution.SolutionValidator().validate(MAX + 1, MAX + 2, 1);
        assertFalse(isValid);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDIsGreaterThanMax() {
        boolean isValid = new Solution.SolutionValidator().validate(1, 2, MAX + 1);
        assertFalse(isValid);
    }
}
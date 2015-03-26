package lesson1.ex2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionValidatorTest {

    public static final int MAX_N = 100000;

    @Test
    public void testArrayIsNull() {
        boolean isValid = new Solution.SolutionValidator().validate(null);
        assertFalse(isValid);
    }

    @Test
    public void testNIsTooLarge() {
        boolean isValid = new Solution.SolutionValidator().validate(new int[MAX_N +1]);
        assertFalse(isValid);
    }

}
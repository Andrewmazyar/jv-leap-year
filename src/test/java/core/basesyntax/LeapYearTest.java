package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearTest {
    @Test
    public void leapYearCount() {
        LeapYear leapYear = new LeapYear();
        for (int i = 1; i <= 2000; i++) {
            int actualResult = leapYear.leapYearCount(i);
            int expectedResult = leapYearCountResult(i);
            Assert.assertEquals("With year: " + i, expectedResult, actualResult);
        }
    }

    private int leapYearCountResult(int year) {
        int result = 0;
        for (int i = 1; i <= year; i++) {
            if (i % 4 == 0) {
                if (i % 100 != 0) {
                    result++;
                } else {
                    if (i % 400 == 0) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
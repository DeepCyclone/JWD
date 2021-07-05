package by.epamtc.voloshchik.task1.logic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DigitLogicTest {

    @Test
    public void calculateLastDigitOfSquaredNumberTest() {
        int number = 47;
        int expected = 9;
        int actual = DigitLogic.calculateLastDigitOfSquaredNumber(number);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void calculateLastDigitOfNegativeSquaredNumberTest() {
        int number = -47;
        int expected = 9;
        int actual = DigitLogic.calculateLastDigitOfSquaredNumber(number);
        Assert.assertEquals(expected,actual);
    }
}
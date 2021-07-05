package by.epamtc.voloshchik.task2.logic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DatesLogicTest {

    @Test
    public void determineNumberOfDaysInMonthOfLeapYearTest() {
        int year = 2000;
        int month = 2;
        int expected = 29;
        int actual = DatesLogic.determineNumberOfDaysInMonth(year,month);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void determineNumberOfDaysInMonthOfTypicalYearTest() {
        int year = 2002;
        int month = 3;
        int expected = 31;
        int actual = DatesLogic.determineNumberOfDaysInMonth(year,month);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void determineNumberOfDaysInNonExistentMonthTest()
    {
        int year = 2002;
        int month = 15;
        int expected = 0;
        int actual = DatesLogic.determineNumberOfDaysInMonth(year,month);
        Assert.assertEquals(expected,actual);
    }
}
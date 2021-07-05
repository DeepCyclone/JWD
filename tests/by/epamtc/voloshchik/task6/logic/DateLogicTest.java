package by.epamtc.voloshchik.task6.logic;

import by.epamtc.voloshchik.task6.bean.Date;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateLogicTest {

    @Test
    public void composeDateFromBeginningOfDay() {
        int second = 70;
        Date expected = new Date(0,1,10);
        Date actual = DateLogic.composeDateFromBeginningOfDay(second);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void composeDateFromBeginningOfDayWithWrongSecondParam() {
        int second = 869345;
        Date expected = null;
        Date actual = DateLogic.composeDateFromBeginningOfDay(second);
        Assert.assertEquals(expected,actual);
    }
}
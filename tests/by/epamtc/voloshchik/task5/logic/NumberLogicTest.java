package by.epamtc.voloshchik.task5.logic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberLogicTest {

    @Test
    public void isNumberIdealTestWithIdealParam() {
        int number = 28;
        Assert.assertTrue(NumberLogic.isNumberIdeal(number));
    }

    @Test
    public void isNumberIdealTestWithNonIdealParam() {
        int number = 15;
        Assert.assertFalse(NumberLogic.isNumberIdeal(number));
    }
}
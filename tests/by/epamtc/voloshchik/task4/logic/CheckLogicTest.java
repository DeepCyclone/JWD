package by.epamtc.voloshchik.task4.logic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckLogicTest {

    @Test
    public void isTwoNumsEvenTest() {
        int a = 4;
        int b = 3;
        int c = 2;
        Assert.assertTrue(CheckLogic.isTwoNumsEven(a,b,c));
    }

    @Test
    public void isTwoNumsEvenTestWithNonEvenParams() {
        int a = 1;
        int b = 3;
        int c = 5;
        Assert.assertFalse(CheckLogic.isTwoNumsEven(a,b,c));
    }

    @Test
    public void isTwoNumsEvenTestWithNegativeParams() {
        int a = -2;
        int b = -4;
        int c = 5;
        Assert.assertTrue(CheckLogic.isTwoNumsEven(a,b,c));
    }
}
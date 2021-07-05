package by.epamtc.voloshchik.task9.logic;

import by.epamtc.voloshchik.exception.NegativeParamException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeParamsTest {

    @Test
    public void countRingLength() throws NegativeParamException {
        int radius = 5;
        double expected = 10 * Math.PI;
        double actual = ShapeParams.countRingLength(radius);
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test (expected = NegativeParamException.class)
    public void countRingLengthWithNegativeParam() throws NegativeParamException {
        int radius = -5;
        double expected = 10 * Math.PI;
        double actual = ShapeParams.countRingLength(radius);
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void countCircleArea() throws NegativeParamException {
        int radius = 3;
        double expected = 9 * Math.PI;
        double actual = ShapeParams.countCircleArea(radius);
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test(expected = NegativeParamException.class)
    public void countCircleAreaWithNegativeParam() throws NegativeParamException {
        int radius = -3;
        double expected = 9 * Math.PI;
        double actual = ShapeParams.countCircleArea(radius);
        Assert.assertEquals(expected,actual,0.01);
    }
}
package by.epamtc.voloshchik.task3.logic;

import by.epamtc.voloshchik.exception.NegativeParamException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculationLogicTest {

    @Test
    public void calculateDiameterOfCircleInscribedToSquareTest() throws NegativeParamException {
        int side = 5;
        int expected = 5;
        double actual = CalculationLogic.calculateDiametrOfCircleInscribedToSquare(side);
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test(expected = NegativeParamException.class)
    public void calculateDiameterOfCircleInscribedToSquareTestWithNegativeParam() throws NegativeParamException {
        int side = -5;
        int expected = 0;
        double actual = CalculationLogic.calculateDiametrOfCircleInscribedToSquare(side);
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void calculateAreaOfSquareInscribedToCircleTest() throws NegativeParamException {
        int diameter = 12;
        double expected = 72;
        double actual = CalculationLogic.calculateAreaOfSquareInscribedToCircle(diameter);
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test(expected = NegativeParamException.class)
    public void calculateAreaOfSquareInscribedToCircleTestWithNegativeParam() throws NegativeParamException {
        int diameter = -12;
        double expected = 72;
        double actual = CalculationLogic.calculateAreaOfSquareInscribedToCircle(diameter);
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void calculateSquareAreaTest() throws NegativeParamException {
        double side = 10;
        double expected = 100;
        double actual = CalculationLogic.calculateSquareArea(side);
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test(expected = NegativeParamException.class)
    public void calculateSquareAreaTestWithNegativeParam() throws NegativeParamException {
        double side = -10;
        double expected = 100;
        double actual = CalculationLogic.calculateSquareArea(side);
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void calculateAreasRatioTest() throws NegativeParamException {
        double area1 = 12.5;
        double area2 = 2.5;
        double expected = 5;
        double actual = CalculationLogic.calculateAreasRatio(area1,area2);
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test(expected = NegativeParamException.class)
    public void calculateAreasRatioTestWithNegativeParam() throws NegativeParamException {
        double area1 = -12.5;
        double area2 = 2.5;
        double expected = 5;
        double actual = CalculationLogic.calculateAreasRatio(area1,area2);
        Assert.assertEquals(expected,actual,0.01);
    }

}
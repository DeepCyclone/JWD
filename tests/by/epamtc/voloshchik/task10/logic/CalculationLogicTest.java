package by.epamtc.voloshchik.task10.logic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculationLogicTest {

    @Test
    public void evaluateTangentByStepsTest() {
        double leftBorder = 3;
        double rightBorder = 4;
        double step = 0.5;
        double[][] expected = new double[][]{{3, -0.1425465430742778},
                {3.5, 0.3745856401585947},
                {4, 1.1578212823495777}
        };
        double[][] actual = CalculationLogic.evaluateTangentBySteps(leftBorder,rightBorder,step);
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void evaluateTangentByStepsTestWithInversedBorders()
    {
        double leftBorder = 4;
        double rightBorder = 3;
        double step = 0.5;
        double[][] expected = null;
        double[][] actual = CalculationLogic.evaluateTangentBySteps(leftBorder,rightBorder,step);
        Assert.assertArrayEquals(expected,actual);
    }
}
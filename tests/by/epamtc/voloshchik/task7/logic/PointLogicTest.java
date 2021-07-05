package by.epamtc.voloshchik.task7.logic;

import by.epamtc.voloshchik.task7.bean.Point;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointLogicTest {

    @Test
    public void findNearestPointToCoordinatesOriginWithNullArgument() {
        Point a = null;
        Point b = new Point(1,2);
        Point expected = b;
        Point actual = PointLogic.findNearestPointToCoordinatesOrigin(a,b);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findNearestPointToCoordinatesOriginWithNullArguments() {
        Point a = null;
        Point b = null;
        Point expected = null;
        Point actual = PointLogic.findNearestPointToCoordinatesOrigin(a,b);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findNearestPointToCoordinatesOrigin() {
        Point a = new Point(3,4);
        Point b = new Point(1,2);
        Point expected = b;
        Point actual = PointLogic.findNearestPointToCoordinatesOrigin(a,b);
        Assert.assertEquals(expected,actual);
    }
}
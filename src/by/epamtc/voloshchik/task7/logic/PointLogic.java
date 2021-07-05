package by.epamtc.voloshchik.task7.logic;

import by.epamtc.voloshchik.task7.bean.Point;

public class PointLogic {

    private PointLogic(){}

    public static Point findNearestPointToCoordinatesOrigin(Point A,Point B) {
        if(A == null && B != null) {
            return B;
        }
        else if(A != null && B == null) {
            return A;
        }
        else if(A == null && B == null) {
            return null;
        }
        double distanceFromOriginToA = evaluateDistanceToCoordinatesOrigin(A);
        double distanceFromOriginToB = evaluateDistanceToCoordinatesOrigin(B);
        return distanceFromOriginToA >= distanceFromOriginToB?B:A;
    }
    private static double evaluateDistanceToCoordinatesOrigin(Point p) {
        return Math.sqrt(Math.pow(p.getX(),2) + Math.pow(p.getY(),2));
    }
}

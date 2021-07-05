package by.epamtc.voloshchik.task7.bean;

import java.io.Serializable;
import java.util.Objects;

public class Point implements Serializable {

    public Point(double x,double y) {
        this.x = x;
        this.y = y;
    }

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(getClass() != obj.getClass())return false;
        Point p = (Point)obj;
        return x == p.getX() && y == p.getY();
    }

    public String toString() {
        return getClass().getSimpleName() +
                "Coords + \n" +
                "x = " + x + "|" + "y = " + y;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + Double.hashCode(x);
        result = result * prime + Double.hashCode(y);
        return result;
    }
}

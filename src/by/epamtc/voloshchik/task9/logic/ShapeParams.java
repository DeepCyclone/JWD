package by.epamtc.voloshchik.task9.logic;

import by.epamtc.voloshchik.exception.NegativeParamException;
import by.epamtc.voloshchik.validation.Validator;

public class ShapeParams {
    public static double countRingLength(double radius) throws NegativeParamException {
        if(!Validator.isPositiveDouble(radius)) {
            throw new NegativeParamException(negativeRadiusMsg());
        }
        return 2 * Math.PI * radius;
    }
    public static double countCircleArea(double radius) throws NegativeParamException {
        if(!Validator.isPositiveDouble(radius)) {
            throw new NegativeParamException(negativeRadiusMsg());
        }
        return Math.PI * Math.pow(radius,2);
    }
    private static String negativeRadiusMsg() {
        return "Radius can't be negative";
    }
}

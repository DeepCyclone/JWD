package by.epamtc.voloshchik.task3.logic;

import by.epamtc.voloshchik.exception.NegativeParamException;
import by.epamtc.voloshchik.validation.Validator;

public class CalculationLogic {
    public static double calculateDiametrOfCircleInscribedToSquare(double squareSide) throws NegativeParamException {
        if(!Validator.isPositiveDouble(squareSide)) {
            throw new NegativeParamException(negativeMathSideMsg());// исключение, т.к. ситуация неоднозначна.
                                                // Можно вернуть 0, если side = 0 или 0, если side < 0 - плохо
        }
        double diameter = squareSide;
        return diameter;
    }
    public static double calculateAreaOfSquareInscribedToCircle(double circleDiameter) throws NegativeParamException {
        if(!Validator.isPositiveDouble(circleDiameter)) {
            throw new NegativeParamException(negativeMathSideMsg());
        }
        double squareArea = Math.pow(circleDiameter,2) / 2;
        return squareArea;
    }
    public static double calculateSquareArea(double squareSide) throws NegativeParamException{
        if(!Validator.isPositiveDouble(squareSide)) {
            throw new NegativeParamException(negativeMathSideMsg());
        }
        return Math.pow(squareSide,2);
    }
    public static double calculateAreasRatio(double biggerArea,double smallerArea) throws NegativeParamException {
        if(!Validator.isPositiveDouble(biggerArea) || !Validator.isPositiveDouble(smallerArea)) {
            throw new NegativeParamException(negativeMathSideMsg());
        }
        return biggerArea / smallerArea;
    }
    private static String negativeMathSideMsg() {
        return "Mathematical side can't be less than zero";
    }
    // если делать целое(композитное) решение задачи, то как назвать метод
}

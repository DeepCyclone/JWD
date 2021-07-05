package by.epamtc.voloshchik.task3.runner;

import by.epamtc.voloshchik.exception.NegativeParamException;
import by.epamtc.voloshchik.scanner.InputLogic;
import static by.epamtc.voloshchik.task3.logic.CalculationLogic.*;

public class Run {
    public static void main(String[] args)
    {
        InputLogic sc = new InputLogic();
        System.out.println("Enter side of a square:");
        double squareSide = sc.inputPositiveDouble();
        try {
            double diametrOfInscribedCircle = calculateDiametrOfCircleInscribedToSquare(squareSide);
            double squareArea = calculateSquareArea(squareSide);
            double inscribedSquareArea = calculateAreaOfSquareInscribedToCircle(diametrOfInscribedCircle);
            System.out.println("Area of square described to the circle, which described to the another square:"
                    + inscribedSquareArea);
            double areasRatio = calculateAreasRatio(squareArea, inscribedSquareArea);
            System.out.println("Area of described square " + areasRatio + "times less than area of the default square");
        }
        catch (NegativeParamException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

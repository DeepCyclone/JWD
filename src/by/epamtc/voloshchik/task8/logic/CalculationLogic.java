package by.epamtc.voloshchik.task8.logic;

public class CalculationLogic {
    public static double evaluateExpression(int x) throws ArithmeticException {
        double result;
        if(x >= 3) {
            result = -Math.pow(x,2) + 3 * x + 9;
        }
        else {
            if((Double.compare((Math.pow(x,3) - 6),0) == 0)){
                throw new ArithmeticException();
            }
            result = 1 / (Math.pow(x,3) - 6);
        }
        return result;
    }
}
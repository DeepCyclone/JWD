package by.epamtc.voloshchik.validation;

public class Validator {
    public static boolean isPositiveInteger(int number)
    {
        return number > 0;
    }
    public static boolean isPositiveDouble(double number) {
        return Double.compare(number,0) > 0;
    }
    public static boolean isCorrectMonth(int month){
        return month > 0 && month <= 12;
    }
    public static boolean isSecondOfDay(int second) {
        return second > 0 && second < 86400;
    }
    public static boolean isCorrectParamsOfCycle(double leftBorder,double rightBorder,double step) {
        boolean isCorrect = true;
        if(step == 0 ||
                ((leftBorder - rightBorder > 0) && step > 0)||
                ((leftBorder - rightBorder < 0) && step < 0)) {
            isCorrect = false;
        }
        return isCorrect;
    }
}

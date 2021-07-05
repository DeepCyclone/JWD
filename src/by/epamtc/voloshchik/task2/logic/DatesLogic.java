package by.epamtc.voloshchik.task2.logic;

import by.epamtc.voloshchik.exception.IncorrectMonthException;
import by.epamtc.voloshchik.exception.NegativeParamException;
import by.epamtc.voloshchik.validation.Validator;

enum Months {
    January(1),
    February(2),
    March(3),
    April(4),
    May(5),
    June(6),
    July(7),
    August(8),
    September(9),
    October(10),
    November(11),
    December(12);

    Months(int sequentialNumber) {
        this.sequentialNumber = sequentialNumber;
    }

    private int sequentialNumber;

    public int getSequentialNumber() {
        return sequentialNumber;
    }
}
public class DatesLogic {
    private static final int TYPICAL_LEAP_YEAR_FREQUENCY = 4;
    private static final int ADDITIONAL_LEAP_YEAR_FREQUENCY = 400;
    private static final int WRONG_LEAP_YEAR_FREQUENCY = 100;

    public static int determineNumberOfDaysInMonth(int year, int month) {
        int days = 0;
        if(!Validator.isPositiveInteger(year) || ! Validator.isCorrectMonth(month)) {
            return days;//не исключение, т.к. ситуация однозначная. Если плохой год или месяц - 0 дней (непорядок!).
                        // Мы не можем вернуть 0 дней в любом другом случае
        }
        if(month == Months.January.getSequentialNumber() ||
                month == Months.March.getSequentialNumber() ||
                month == Months.May.getSequentialNumber() ||
                month == Months.July.getSequentialNumber() ||
                month == Months.August.getSequentialNumber() ||
                month == Months.October.getSequentialNumber() ||
                month == Months.December.getSequentialNumber()) {
            days = 31;
        }
        else if(month == Months.April.getSequentialNumber() ||
                month == Months.June.getSequentialNumber() ||
                month == Months.September.getSequentialNumber() ||
                month == Months.November.getSequentialNumber()) {
            days = 30;
        }
        else if(month == Months.February.getSequentialNumber()) {
            days = isLeapYear(year)?29:28;
        }
        return days;

        //в -1995 году 0 дней будет (не учитываем до нашей эры)
    }

    private static boolean isLeapYear(int year) {
        boolean isLeap = false;
        if((year % TYPICAL_LEAP_YEAR_FREQUENCY == 0 && year % WRONG_LEAP_YEAR_FREQUENCY != 0) ||
                year % ADDITIONAL_LEAP_YEAR_FREQUENCY == 0)  {
            isLeap = true;
        }
        return isLeap;
    }

}



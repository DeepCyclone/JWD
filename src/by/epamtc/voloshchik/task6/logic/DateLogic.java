package by.epamtc.voloshchik.task6.logic;

import by.epamtc.voloshchik.task6.bean.Date;
import by.epamtc.voloshchik.validation.Validator;

public class DateLogic {

    private final static int SECONDS_IN_HOUR = 3600;
    private final static int SECONDS_IN_MINUTE = 60;

    private DateLogic(){}

    public static Date composeDateFromBeginningOfDay (int elapsedSeconds){
        if(!Validator.isPositiveInteger(elapsedSeconds) || !Validator.isSecondOfDay(elapsedSeconds)) {
            return null;
        }
        int currentHour = calculateCurrentHour(elapsedSeconds);
        int currentMinute = calculateCurrentMinute(elapsedSeconds);
        int currentSecond = elapsedSeconds - (currentHour * SECONDS_IN_HOUR + currentMinute * SECONDS_IN_MINUTE);
        return new Date(currentHour,currentMinute,currentSecond);
    }

    private static int calculateCurrentHour(int elapsedSeconds)
    {
        return (elapsedSeconds / SECONDS_IN_HOUR);
    }

    private static int calculateCurrentMinute(int elapsedSeconds) {
        return (elapsedSeconds / SECONDS_IN_MINUTE) % SECONDS_IN_MINUTE;
    }

}

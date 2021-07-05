package by.epamtc.voloshchik.task6.presentation;

import by.epamtc.voloshchik.task6.bean.Date;

public class DateViewer {
    public static void printDate(Date date) {
        if(date == null){
        return;
        }
        System.out.println("|Current hour:" + date.getHour() +
                "|Current minute:" + date.getMinute() +
                "|Current second:" + date.getSecond());
    }
}

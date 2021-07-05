package by.epamtc.voloshchik.task6.runner;

import by.epamtc.voloshchik.scanner.InputLogic;
import by.epamtc.voloshchik.task6.bean.Date;
import by.epamtc.voloshchik.task6.logic.DateLogic;
import by.epamtc.voloshchik.task6.presentation.DateViewer;

public class Run {
    public static void main(String[] args) {
        InputLogic sc = new InputLogic();
        System.out.println("Enter number of seconds elapsed from beginning of a day:");
        int elapsedSeconds = sc.inputInteger();
        Date currentDate = DateLogic.composeDateFromBeginningOfDay(elapsedSeconds);
        DateViewer.printDate(currentDate);
    }
}

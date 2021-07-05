package by.epamtc.voloshchik.task6.bean;

import java.io.Serializable;

public class Date implements Serializable {

    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public Date(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(getClass() != obj.getClass() || obj == null)return false;
        Date d = (Date)obj;
        return hour == d.getHour() && minute == d.getMinute() && second == d.getSecond();
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + second;
        result = prime * result + minute;
        result = prime * result + hour;
        return result;
    }

    public String toString() {
        return  "Classname:" + getClass().getSimpleName() +
                " Hour:"+hour+
                "|Minute:"+minute+
                "|Second:"+second;
    }
}

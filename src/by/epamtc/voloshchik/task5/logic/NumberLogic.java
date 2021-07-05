package by.epamtc.voloshchik.task5.logic;

public class NumberLogic {
    public static boolean isNumberIdeal(int number)
    {
        if(number <= 1) {
            return false;
        }
        int divisorsSum = 1;
        for(int i = 2;i <= number / 2;++i) {
            if(number % i == 0) {
                divisorsSum += i;
            }
        }
        return divisorsSum == number;
        //улучшенный алгоритм
    }
}

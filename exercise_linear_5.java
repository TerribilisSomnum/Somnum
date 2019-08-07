package by.etc.somnum.chapter_1;

/*
Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
*/

public class exercise_linear_5 {
    
    public static void main(String[] args){
        
        int timeInSeconds = 6543;
        System.out.printf(" Часов: %d\n Минут: %d\n Секунд: %d\n",timeInSeconds / 3600, timeInSeconds / 60 % 60, timeInSeconds % 60);
    }
}


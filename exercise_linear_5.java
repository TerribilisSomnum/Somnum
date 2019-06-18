package by.etc.somnum.chapter_1;

public class exercise_linear_5 {
    public static void main(String[] args){
        int timeInSeconds = 6543;
        System.out.printf(" Часов: %d\n Минут: %d\n Секунд: %d\n",timeInSeconds / 3600, timeInSeconds / 60 % 60, timeInSeconds % 60);
    }
}

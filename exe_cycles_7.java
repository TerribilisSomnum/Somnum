package by.etc.somnum.chapter_1;
import java.util.Scanner;

public class exe_cycles_7 {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите начало промежутка: ");
        int mBegin = reader.nextInt();
        System.out.print("Введите конец промежутка: ");
        int nEnd = reader.nextInt();

           for (int i = mBegin; i <= nEnd; i++){
               System.out.format("%d: ", i);
               for (int y = 2; y < i; y++){
                   if (i % y == 0)
                   System.out.format("%2d",y);
                }
               System.out.format("\n");
           }
    }
}


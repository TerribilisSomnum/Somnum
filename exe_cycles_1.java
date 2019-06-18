package by.etc.somnum.chapter_1;
import java.util.Scanner;

public class exe_cycles_1 {
    public static void main(String[] args){

        int x;
        int y = 0;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите любое положительное число: ");
        x = reader.nextInt();
        for (int i = 1; i <= x; i++){
            y += i;
        }
        System.out.println(y);
    }
}

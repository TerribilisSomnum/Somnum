package by.etc.somnum.chapter_1;

import java.util.Scanner;
import static java.lang.System.exit;

public class exercise_branching_1 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Угол X: ");
        int x = in.nextInt();
        System.out.print("Угол Y: ");
        int y = in.nextInt();
        if (x == 180 || y == 180){
            System.out.println("Такого треугольника не существует");
            exit(0);
        }
        if (x + y + 90 == 180){
            System.out.println("Прямоугольник равносторонний");
        } else {
            System.out.println("Прямоугольник не равносторонний");
        }
    }
}

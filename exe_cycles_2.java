package by.etc.somnum.chapter_1;
import java.util.Scanner;

//Вычислить значения функции на отрезке [а,b] c шагом h: 

public class exe_cycles_2 {
    public static void main(String[] args){
        double a = (-2);
        double b = 10;
        System.out.println("Вам дан отрезок от 0 до 10");
        System.out.print("Введите шаг h: ");
        Scanner reader = new Scanner(System.in);
        double h = reader.nextDouble();

        for(double i = a; i <= b; i+=h) {
                System.out.format("f(%.2f) = %.2f\n", i, i > 2 ? i : -i);
        }
    }
}


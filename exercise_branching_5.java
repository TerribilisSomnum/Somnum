package by.etc.somnum.chapter_1;
import java.util.Scanner;

public class exercise_branching_5 {
    public static void main(String[] args) {

        double x;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите значение для числа 'x': ");
        x = reader.nextDouble();
        double y = f(x);
        System.out.println("Answer: " + y);
    }

    public static double f(double x) {
        if (x <= 3) {
            return (Math.pow(x, 2) - 3 * x + 9);
        } else if (x > 3) {
            return (Math.pow(x, 3) + 6);
        }
        return 0;
    }
}
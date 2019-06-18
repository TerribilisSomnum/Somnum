package by.etc.somnum.chapter_1;
import java.util.Scanner;

import static java.lang.Integer.max;
import static java.lang.Integer.min;

public class exercise_branching_4 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int sizeA = 10;
        int sizeB = 5;
        System.out.println("Вам дан кирпич");
        System.out.print("Введите сторону X: ");
        int x = reader.nextInt();
        System.out.print("Введите сторону Y: ");
        int y = reader.nextInt();
        System.out.print("Введите сторону Z: ");
        int z = reader.nextInt();

        if ((min(x, y) < min(sizeA, sizeB)) && (max(x, y) < max(sizeA, sizeB))) {
            System.out.println("Кирпич пройдет");
        } else if ((min(y, z) < min(sizeA, sizeB)) && (max(y, z) < max(sizeA, sizeB))) {
            System.out.println("Кирпич пройдет");
        } else if ((min(x, z) < min(sizeA, sizeB)) && (max(x, z) < max(sizeA, sizeB))) {
            System.out.println("Кирпич пройдет");
        } else{
        System.out.println("Ты не пройдешь!");
        }
    }
}
package by.etc.somnum.chapter_1;
import java.util.Scanner;

public class exercise_branching_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите координатe x1 для точки А: ");
        int x1 = in.nextInt();
        System.out.print("Введите координатe y1 для точки A: ");
        int y1 = in.nextInt();
        System.out.print("Введите координатe x2 для точки B: ");
        int x2 = in.nextInt();
        System.out.print("Введите координатe y2 для точки B: ");
        int y2 = in.nextInt();
        System.out.print("Введите координатe x3 для точки C: ");
        int x3 = in.nextInt();
        System.out.print("Введите координатe y3 для точки C: ");
        int y3 = in.nextInt();
        if ((x1 / y1 == 1) && (x2 / y2 == 1) && (x3 / y3 == 1)) {
            System.out.println("Ваши точки на одной прямой");
        } else {
            System.out.println("Ваши точки не на одной прямой");
        }
    }
}
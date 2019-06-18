package by.etc.somnum.chapter_1;

public class exercise_linear_2 {
    public static void main(String[] args)
    {
        int a = 3;
        int b = 2;
        int c = 1;
        int z = (int) (((b + (Math.sqrt(Math.pow(b, 2) + 4 * a * c)))/ 2 * c) - (Math.pow(a, 3)) * c + (Math.pow(b, -2)));
        System.out.println(z);
    }
}

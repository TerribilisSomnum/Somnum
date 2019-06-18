package by.etc.somnum.chapter_1;
import static java.lang.Integer.max;
import static java.lang.Integer.min;

public class exercise_branching_2 {
    public static void main(String[] args){

        int a = 54;
        int b = 32;
        int c = 65;
        int d = 11;
        System.out.println(max(min(a, b), min(c,d)));
    }
}

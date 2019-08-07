package by.etc.somnum.chapter_1;

import java.util.*;

// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class exe_cycles_8 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите первое и второе число через пробел: ");
        int numberOne = reader.nextInt();
        int numberTwo = reader.nextInt();

        Set<Character> uniqueNumberOneSymbols = new HashSet<Character>();
        for (char c : String.valueOf(numberOne).toCharArray()) {
            uniqueNumberOneSymbols.add(c);
        }
        
        Set<Character> uniqueNumberTwoSymbols = new HashSet<Character>();
        for (char c : String.valueOf(numberTwo).toCharArray()) {
            uniqueNumberTwoSymbols.add(c);
        }
        
        Set<Character> intersection = new HashSet<Character>(uniqueNumberOneSymbols);
        intersection.retainAll(uniqueNumberTwoSymbols);

        System.out.print("Общие цифры: ");
        System.out.print(intersection);
    }
}


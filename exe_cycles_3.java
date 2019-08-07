package by.etc.somnum.chapter_1;

// Найти сумму квадратов первых ста чисел.

public class exe_cycles_3 {
    
    public static void main(String[] args){
        
        int number = 100;
        int sum = 0;
        sum = (number * (number + 1) * (2 * number + 1)) / 6; 
    System.out.format("%d",sum);
    }
}


package by.etc.somnum.chapter_1;

// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class exe_cycles_6 {
    
    public static void main(String[] args){

        for (Character i = Character.MIN_VALUE; i <= Character.MAX_VALUE; i++){
            System.out.format("%d = %c\n", (int)i, i);
        }
    }
}


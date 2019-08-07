package by.etc.somnum.chapter_1;
import java.lang.Math;
import java.util.Scanner;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//заданному е. Общий член ряда имеет вид:

public class exe_cycles_5 {
    
    public static void main(String[] args){

        System.out.print("Введите число 'e': ");
        Scanner reader = new Scanner(System.in);
        double number = reader.nextDouble();
        double sum = 0;
        
        for(int i = 1; common_member(i) >= number; i++){
            sum += common_member(i);
        }
        System.out.println(sum);
    }

    public static double common_member(double number){
        return (((1 /(Math.pow(2, number))) + (1 /(Math.pow(3, number)))));
    }
}


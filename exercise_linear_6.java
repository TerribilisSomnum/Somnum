package by.etc.somnum.chapter_1;

//Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае: 

import java.util.Scanner;

public class exercise_linear_6 {
    
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Введите координату X: ");
        int x = in.nextInt();
        
        System.out.print("Введите координату Y: ");
        int y = in.nextInt();
        
        if (((x >= -2 && x <= 2) && (y >= 0 && y <= 4)) || ((x >= -4 && x <= 4) && (y >= -3 && y <= 0))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}


package by.etc.somnum.chapter_1;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения):

import java.lang.Math;

public class exercise_linear_3 {
    
    public static void main(String[] args) {
        
        double x = 1;
        double y = 2;
        
        double z = ((((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)))) * Math.tan(x * y));
        System.out.println(z);
    }
}


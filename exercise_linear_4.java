package by.etc.somnum.chapter_1;

//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//дробную и целую части числа и вывести полученное значение числа.
    
public class exercise_linear_4 {
    
    public static void main(String[] args) {
        
        double number = 444.555;
        number = ((int) number / 1000.0 + (number - (int) number) * 1000);
        System.out.format("%.3f",number);
    }
}


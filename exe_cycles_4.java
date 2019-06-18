package by.etc.somnum.chapter_1;
import java.math.BigInteger;

public class exe_cycles_4 {
    public static void main(String[] args){
        System.out.println(factorial(BigInteger.valueOf(200)).pow(2));
    }

    public static BigInteger factorial(BigInteger n) {
        BigInteger result = BigInteger.ONE;

        while (!n.equals(BigInteger.ZERO)) {
            result = result.multiply(n);
            n = n.subtract(BigInteger.ONE);
        }
        return result;
    }
}

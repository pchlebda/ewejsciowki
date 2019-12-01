package pl.arrays;

import java.math.BigInteger;

public class Arrays {

    public int[] product(int[] input) {
        int[] result = new int[input.length];
        BigInteger product = new BigInteger("1");
        for (int i : input) {
            product = product.multiply(BigInteger.valueOf(i));
        }
        for (int i = 0; i < input.length; ++i) {
            result[i] = product.divide(BigInteger.valueOf(input[i])).intValue();
    }
        return result;
    }
}

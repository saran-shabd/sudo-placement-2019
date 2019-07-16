package hash;

import misc.FastIO;

import java.math.BigInteger;
import java.util.HashMap;

public class NonRepeatingElement {

    public static void main(String[] args) {
        final FastIO io = new FastIO();
        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            final int n = io.nextInt();
            final BigInteger[] arr = new BigInteger[n];
            for (int i = 0; i < n; ++i)
                arr[i] = io.nextBigInteger();
            BigInteger result = new NonRepeatingElementSolver().solve(arr);
            System.out.println(result);
        }
    }
}

class NonRepeatingElementSolver {

    BigInteger solve(BigInteger [] arr) {
        HashMap<BigInteger, BigInteger> counts = new HashMap<>();
        for (BigInteger item : arr)
            if (counts.containsKey(item))
                counts.replace(item, counts.get(item).add(BigInteger.ONE));
            else
                counts.put(item, BigInteger.ONE);
        for (BigInteger item : arr)
            if (counts.get(item).equals(BigInteger.ONE))
                return item;
        return BigInteger.ZERO;
    }
}

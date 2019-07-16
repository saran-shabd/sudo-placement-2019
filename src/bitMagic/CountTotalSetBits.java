package bitMagic;

import misc.FastIO;

public class CountTotalSetBits {

    public static void main(String[] args) {
        FastIO io = new FastIO();
        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            int n = io.nextInt();
            int result = new CountTotalSetBitsSolver().solve(n);
            System.out.println(result);
        }
    }
}

class CountTotalSetBitsSolver {

    int solve(int n) {
        int result = 0;
        for (int i = 1; i <= n; ++i)
            result += getBitCount(i);
        return result;
    }

    private int getBitCount(int n) {
        char [] binary = new StringBuilder(Integer.toBinaryString(n)).reverse().toString().toCharArray();
        int count = 0;
        for (char item : binary)
            if (item == '1')
                ++count;
        return count;
    }
}

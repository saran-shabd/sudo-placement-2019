package bitMagic;

import misc.FastIO;

public class FirstSetBit {

    public static void main(String[] args) {
        FastIO io = new FastIO();
        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            int n = io.nextInt();
            int result = new FirstSetBitSolver().solve(n);
            System.out.println(result);
        }
    }
}

class FirstSetBitSolver {

    int solve(int n) {
        char [] binary = new StringBuilder(Integer.toBinaryString(n)).reverse().toString().toCharArray();
        int result = 0;
        boolean isFound = false;
        for (char item : binary) {
            ++result;
            if (item == '1') {
                isFound = true;
                break;
            }
        }

        if (!isFound)
            return 0;
        return result;
    }
}

package divideAndConquer;

import misc.FastIO;

public class SequenceOfSequence {

    public static void main(String[] args) {
        final FastIO io = new FastIO();

        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            final int m = io.nextInt();
            final int n = io.nextInt();

            int result = new SequenceOfSequenceSolver().solve(m, n);
            System.out.println(result);
        }
    }
}

class SequenceOfSequenceSolver {

    int solve(final int m, final int n) {
        if (m < n)
            return 0;

        if (0 == n)
            return 1;

        return solve(m - 1, n) + solve(m/2, n - 1);
    }
}

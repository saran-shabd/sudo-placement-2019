package recursion;

import misc.FastIO;

public class JosephusProblem {

    public static void main(String[] args) {
        final FastIO io = new FastIO();

        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            final int peopleCount = io.nextInt();
            final int skips = io.nextInt();

            int result = new JosephusProblemSolver().solve(peopleCount, skips);
            System.out.println(result);
        }
    }
}

class JosephusProblemSolver {

    int solve(final int peopleCount, final int skips) {
        return helper(peopleCount, skips) + 1;
    }

    private int helper(final int peopleCount, final int skips) {
        if (1 == peopleCount)
            return 0;
        return (helper(peopleCount - 1, skips) + skips) % peopleCount;
    }
}

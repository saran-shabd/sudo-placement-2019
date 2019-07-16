package recursion;

import misc.FastIO;

public class NumberOfPaths {

    public static void main(String [] args) {
        final FastIO io = new FastIO();

        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            final int rowsCount = io.nextInt();
            final int colsCount = io.nextInt();

            int result = new NumberOfPathsSolver().solve(rowsCount, colsCount);
            System.out.println(result);
        }
    }
}

class NumberOfPathsSolver {
    private int rowsCount = 0, colsCount = 0;

    int solve(final int rows, final int cols) {
        this.rowsCount = rows;
        this.colsCount = cols;

        return move(0, 0);
    }

    private int move(int i, int j) {
        if (i == this.rowsCount - 1 && j == this.colsCount - 1)
            return 1;

        int currCount = 0;
        if (i < this.rowsCount - 1)
            currCount += move(i+1, j);
        if (j < this.colsCount - 1)
            currCount += move(i, j+1);

        return currCount;
    }
}

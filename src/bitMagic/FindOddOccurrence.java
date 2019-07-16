package bitMagic;

import misc.FastIO;

public class FindOddOccurrence {

    public static void main(String[] args) {
        FastIO io = new FastIO();
        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            int n = io.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; ++i)
                arr[i] = io.nextInt();
            int result = new FindOddOccurrenceSolver().solve(arr);
            System.out.println(result);
        }
    }
}

class FindOddOccurrenceSolver {

    int solve(int [] arr) {
        int result = 0;
        for (int item : arr)
            result ^= item;
        return result;
    }
}

package arraysAndSearching;

import fastIO.FastIO;
import java.util.Arrays;

public class FloorInSortedArray {

    public static void main(String [] args) {
        final FastIO io = new FastIO();
        for (int testcase = io.nextInt(); testcase > 0; --testcase) {;
            final int n = io.nextInt();
            final int x = io.nextInt();
            final int [] arr = new int[n];
            for (int i = 0; i < n; ++i)
                arr[i] = io.nextInt();
            int result = new FloorInSortedArraySolver().solve(arr, x);
            System.out.println(result);
        }
    }
}

class FloorInSortedArraySolver {

    int solve(int [] arr, int x) {
        int pos = Arrays.binarySearch(arr, x);
        if (pos >= 0)
            return pos;
        return -(pos + 1) - 1;
    }
}

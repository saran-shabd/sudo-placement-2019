package arraysAndSearching;

import misc.FastIO;

public class PeakElement {

    public static void main(String [] args) {
        final FastIO io = new FastIO();
        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            final int n = io.nextInt();
            final int [] arr = new int[n];
            for (int i = 0; i < n; ++i)
                arr[i] = io.nextInt();
            int result = new PeakElementSolver().solve(arr);
            System.out.println(result);
        }
    }
}

class PeakElementSolver {

    int solve(int [] arr) {
        if (1 == arr.length)
            return 0;
        if (arr[1] < arr[0])
            return 0;
        if (arr[arr.length - 1] > arr[arr.length - 2])
            return arr.length - 1;

        for (int i = 1; i < arr.length - 1; ++i) {
            if (arr[i] > arr[i-1] && arr[i] > arr[i+1])
                return i;
        }

        return -1;  // no peak element
    }
}

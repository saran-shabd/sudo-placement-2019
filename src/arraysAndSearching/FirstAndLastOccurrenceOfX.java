package arraysAndSearching;

import java.util.Arrays;
import fastIO.FastIO;

public class FirstAndLastOccurrenceOfX {

    public static void main(String [] args) {
        final FastIO io = new FastIO();
        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            final int n = io.nextInt();
            final int [] arr = new int[n];
            for (int i = 0; i < n; ++i)
                arr[i] = io.nextInt();
            final int x = io.nextInt();
            String result = new FirstAndLastOccurrenceOfXSolver().solve(arr, x);
            System.out.println(result);
        }
    }
}

class FirstAndLastOccurrenceOfXSolver {

    String solve(int [] arr, int x) {
        int pos = Arrays.binarySearch(arr, x);
        if (pos < 0) // element not found
            return "-1";

        int left = pos, right = pos;
        while (left >= 0 && arr[left] == x)
            left -= 1;
        while (right < arr.length && arr[right] == x)
            right += 1;

        return (left + 1) + " " + (right - 1);
    }
}

package hash;

import misc.FastIO;
import java.util.HashMap;

public class ZeroSumSubarray {

    public static void main(String[] args) {
        final FastIO io = new FastIO();
        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            final int n = io.nextInt();
            final int [] arr = new int[n];
            for (int i = 0; i < n; ++i)
                arr[i] = io.nextInt();
            int result = new ZeroSumSubarraySolver().solve(arr);
            System.out.println(result);
        }
    }
}

class ZeroSumSubarraySolver {

    int solve(int [] arr) {
        HashMap<Integer, Integer> sums = new HashMap<>();
        sums.put(0, 1);

        int currSum = 0, count = 0;
        for (int item : arr) {
            currSum += item;

            if (sums.containsKey(currSum)) {
                count += sums.get(currSum);
                sums.put(currSum, sums.get(currSum) + 1);
            } else {
                sums.put(currSum, 1);
            }
        }

        return count;
    }
}

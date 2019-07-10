package arraysAndSearching;

import fastIO.FastIO;

public class SubArrayWithGivenSum {

    public static void main(String [] args) {
        final FastIO io = new FastIO();
        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            final int n = io.nextInt();
            final int s = io.nextInt();
            final int [] arr = new int[n];
            for (int i = 0; i < n; ++i)
                arr[i] = io.nextInt();
            String result = new SubArrayWithGivenSumSolver().solve(arr, s);
            System.out.println(result);
        }
    }
}

class SubArrayWithGivenSumSolver {

    String solve(int [] arr, int s) {
        int sum = 0, start = 0, end = 0;
        boolean isFound = false;

        for (int i = 0; i < arr.length; ++i) {
            if (sum == s) {
                isFound = true;
                break;
            }
            while (sum > s && start < end) {
                sum -= arr[start];
                start += 1;
                if (sum == s) {
                    isFound = true;
                    break;
                }
            }

            if (isFound)
                break;

            sum += arr[i];
            end = i;
        }

        while (!isFound && sum >= s && start < arr.length) {
            if (sum == s) {
                isFound = true;
                break;
            }
            start += 1;
            sum -= arr[start];
        }

        if (isFound)
            return (start + 1) + " " + (end + 1);
        return "-1";
    }
}

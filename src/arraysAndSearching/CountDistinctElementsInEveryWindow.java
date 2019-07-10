package arraysAndSearching;

import fastIO.FastIO;
import java.util.HashMap;

public class CountDistinctElementsInEveryWindow {

    public static void main(String[] args) {
        FastIO io = new FastIO();
        for (int testcases = io.nextInt(); testcases > 0; --testcases) {
            int n = io.nextInt();
            int k = io.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; ++i)
                arr[i] = io.nextInt();
            String result = new CountDistinctElementsInEveryWindowSolver().solve(n, k, arr);
            System.out.println(result);
        }
    }
}

class CountDistinctElementsInEveryWindowSolver {

    String solve(int n, int k, int[] arr) {
        StringBuilder result = new StringBuilder();

        HashMap<Integer, Integer> distinct = new HashMap<>();
        for (int i = 0; i < k; ++i) {
            if (distinct.containsKey(arr[i])) {
                distinct.put(arr[i], distinct.get(arr[i]) + 1);
            } else {
                distinct.put(arr[i], 1);
            }
        }
        result.append(distinct.size());
        result.append(" ");

        for (int i = 1; i < n - k + 1; ++i) {
            if (distinct.get(arr[i - 1]) == 1) {
                distinct.remove(arr[i - 1]);
            } else {
                distinct.put(arr[i - 1], distinct.get(arr[i - 1]) - 1);
            }

            if (distinct.containsKey(arr[i + k - 1])) {
                distinct.put(arr[i + k - 1], distinct.get(arr[i + k - 1]) + 1);
            } else {
                distinct.put(arr[i + k - 1], 1);
            }

            result.append(distinct.size());
            result.append(" ");
        }

        return result.toString();
    }
}

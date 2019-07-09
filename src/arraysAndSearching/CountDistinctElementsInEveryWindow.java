package arraysAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class CountDistinctElementsInEveryWindow {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int testcases = Integer.parseInt(br.readLine()); testcases > 0; --testcases) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; ++i) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            String result = new CountDistinctElementsInEveryWindowSolver().solve(n, k, arr);

            System.out.println(result);
        }

        br.close();
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

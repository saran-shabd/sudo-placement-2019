package arraysAndSearching;

import fastIO.FastIO;

public class ImmediateSmallerElement {

    public static void main(String[] args) {
        FastIO io = new FastIO();
        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            int n = io.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; ++i)
                arr[i] = io.nextInt();
            String result = new ImmediateSmallerElementSolver().solve(arr);
            System.out.println(result);
        }
    }
}

class ImmediateSmallerElementSolver {

    String solve(int [] arr) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.length - 1; ++i) {
            if (arr[i+1] < arr[i])
                result.append(arr[i+1]);
            else
                result.append(-1);
            result.append(" ");
        }
        result.append(-1);

        return result.toString();
    }
}

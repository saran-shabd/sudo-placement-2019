package arraysAndSearching;

import fastIO.FastIO;
import java.util.Arrays;

public class ChocolateDistributionProblem {

    public static void main(String[] args) {
        FastIO io = new FastIO();
        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            int n = io.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; ++i)
                arr[i] = io.nextInt();
            int students = io.nextInt();
            int diff = new ChocolateDistributionProblemSolver().solve(n, students, arr);
            System.out.println(diff);
        }
    }
}

class ChocolateDistributionProblemSolver {
    int solve(int n, int students, int [] arr) {
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < n - students + 1; ++i) {
            if (arr[i + students - 1] - arr[i] < diff) {
                diff = arr[i + students - 1] - arr[i];
            }
        }
        return diff;
    }
}

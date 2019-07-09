package arraysAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ChocolateDistributionProblem {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int testcase = Integer.parseInt(br.readLine()); testcase > 0; --testcase) {

            int n = Integer.parseInt(br.readLine());
            int [] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; ++i)
                arr[i] = Integer.parseInt(st.nextToken());

            System.out.println("n = " + n);
            for (int item : arr) System.out.print(item + " ");
            System.out.println();

            int students = Integer.parseInt(br.readLine());

            int diff = new ChocolateDistributionProblemSolver().solve(n, students, arr);

            System.out.println(diff);
        }

        br.close();
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

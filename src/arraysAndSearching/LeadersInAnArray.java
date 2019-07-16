package arraysAndSearching;

import misc.FastIO;
import java.util.ArrayList;

public class LeadersInAnArray {

    public static void main(String[] args) {
        FastIO io = new FastIO();
        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            int n = io.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; ++i)
                arr[i] = io.nextInt();
            String result = new LeadersInAnArraySolver().solve(arr);
            System.out.println(result);
        }
    }
}

class LeadersInAnArraySolver {

    String solve(int [] arr) {
        StringBuilder result = new StringBuilder();
        ArrayList<Integer> leaders = new ArrayList<>();
        leaders.add(arr[arr.length - 1]);
        int maximum = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; --i) {
            if (arr[i] >= maximum) {
                leaders.add(arr[i]);
                maximum = arr[i];
            }
        }

        for (int i = leaders.size() - 1; i >= 0; --i) {
            result.append(leaders.get(i));
            result.append(" ");
        }

        return result.toString();
    }
}

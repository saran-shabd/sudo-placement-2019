package arraysAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class LeadersInAnArray {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int testcase = Integer.parseInt(br.readLine()); testcase > 0; --testcase) {
            int n = Integer.parseInt(br.readLine());
            int [] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; ++i)
                arr[i] = Integer.parseInt(st.nextToken());

            String result = new LeadersInAnArraySolver().solve(arr);

            System.out.println(result);
        }

        br.close();
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

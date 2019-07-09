package arraysAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindTheFine {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int testcase = Integer.parseInt(br.readLine()); testcase > 0; --testcase) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int [] cars = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; ++i)
                cars[i] = Integer.parseInt(st.nextToken());

            int [] penalties = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; ++i)
                penalties[i] = Integer.parseInt(st.nextToken());

            int result = new FindTheFineSolver().solve(cars, penalties, d);
            System.out.println(result);
        }

        br.close();
    }
}

class FindTheFineSolver {

    int solve(int [] cars, int [] penalties, int d) {
        boolean isEven = d % 2 == 0;
        int total = 0;

        for (int i = 0; i < cars.length; ++i) {
            if (cars[i] % 2 != 0 && isEven)  // Odd car on Even day
                total += penalties[i];
            else if (cars[i] % 2 == 0 && !isEven)  // Even car on Odd day
                total += penalties[i];
        }

        return total;
    }
}

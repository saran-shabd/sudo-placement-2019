package arraysAndSearching;

import fastIO.FastIO;

public class FindTheFine {

    public static void main(String[] args) {
        FastIO io = new FastIO();
        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            int n = io.nextInt();
            int d = io.nextInt();
            int [] cars = new int[n];
            for (int i = 0; i < n; ++i)
                cars[i] = io.nextInt();
            int [] penalties = new int[n];
            for (int i = 0; i < n; ++i)
                penalties[i] = io.nextInt();
            int result = new FindTheFineSolver().solve(cars, penalties, d);
            System.out.println(result);
        }
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

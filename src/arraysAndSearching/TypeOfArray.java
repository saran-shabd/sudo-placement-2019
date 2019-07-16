package arraysAndSearching;

import misc.FastIO;

public class TypeOfArray {

    public static void main(String [] args) {
        final FastIO io = new FastIO();
        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            final int n = io.nextInt();
            final int [] arr = new int[n];
            for (int i = 0; i < n; ++i)
                arr[i] = io.nextInt();
            String result = new TypeOfArraySolver().solve(arr);
            System.out.println(result);
        }
    }
}

class TypeOfArraySolver {

    String solve(int [] arr) {
        if (arr[0] < arr[arr.length - 1]) {
            int minItem = arr[0], maxItem = arr[0];
            for (int item : arr) {
                maxItem = Integer.max(maxItem, item);
                minItem = Integer.min(minItem, item);
            }

            if (minItem == arr[0] && maxItem == arr[arr.length - 1])
                return maxItem + " " + 1;
            return maxItem + " " + 3;

        } else {
            int minItem = arr[0], maxItem = arr[0];
            for (int item : arr) {
                maxItem = Integer.max(maxItem, item);
                minItem = Integer.min(minItem, item);
            }

            if (minItem == arr[arr.length - 1] && maxItem == arr[0])
                return maxItem + " " + 2;
            return maxItem + " " + 4;
        }
    }
}

package arraysAndSearching;

import fastIO.FastIO;
import java.util.HashSet;

public class PythagoreanTriplet {

    public static void main(String [] args) {
        final FastIO io = new FastIO();
        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            final int n = io.nextInt();
            final int [] arr = new int[n];
            for (int i = 0; i < n; ++i)
                arr[i] = io.nextInt();
            boolean result = new PythagoreanTripletSolver().solve(arr);
            if (result)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}

class PythagoreanTripletSolver {

    boolean solve(int [] arr) {
        HashSet<Double> elements = new HashSet<>();
        for (int item : arr)
            elements.add((double) item);

        for (int item1 : arr)
            for (int item2 : arr)
                if (elements.contains(Math.sqrt(Math.pow(item1, 2) + Math.pow(item2, 2))))
                    return true;
        return false;
    }
}

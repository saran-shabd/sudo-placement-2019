package hash;

import misc.FastIO;
import java.util.HashMap;
import java.util.HashSet;

public class CountDistinctPairsWithDifferenceK {

    public static void main(String [] args) {
        final FastIO io = new FastIO();

        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            final int n = io.nextInt();
            final int [] arr = new int[n];
            for (int i = 0; i < n; ++i)
                arr[i] = io.nextInt();
            final int k = io.nextInt();

            int result = new CountDistinctPairsWithDifferenceKSolver().solve(arr, k);
            System.out.println(result);
        }
    }
}

class CountDistinctPairsWithDifferenceKSolver {

    int solve(final int [] arr, final int k) {
        HashMap<Integer, Integer> elements = new HashMap<>();
        for (int item : arr) {
            if (!elements.containsKey(item))
                elements.put(item, 1);
            else
                elements.replace(item, elements.get(item) + 1);
        }

        HashSet<Integer> visited = new HashSet<>();
        int count = 0;
        for (int item : arr) {
            int required = Math.abs(item - k);
            if (!visited.contains(item)) {
                Integer counter = elements.get(required);
                if (null != counter) {
                    if (required != item) ++count;
                    else
                    if (counter > 1) ++count;
                }
                visited.add(item);
            }
        }

        return count;
    }
}

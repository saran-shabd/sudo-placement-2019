package hash;

import misc.FastIO;

import java.util.PriorityQueue;

public class CheckIfArrayContainsContiguousElementsWithDuplicates {

    public static void main(String[] args) {
        FastIO io = new FastIO();
        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            int n = io.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; ++i)
                arr[i] = io.nextInt();
            boolean result = new CheckIfArrayContainsContiguousElementsWithDuplicatesSolver().solve(arr);
            if (result)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}

class CheckIfArrayContainsContiguousElementsWithDuplicatesSolver {

    boolean solve(int [] arr) {
        PriorityQueue<Integer> elements = new PriorityQueue<>();
        for (int item : arr)
            elements.add(item);
        int before = elements.peek();
        while (!elements.isEmpty()) {
            int temp = elements.poll();
            if (temp - before > 1)
                return false;
            before = temp;
        }
        return true;
    }
}

package stack;

import misc.FastIO;

import java.util.Deque;
import java.util.LinkedList;

public class MaxAreaHistogram {

    public static void main(String[] args) {
        final FastIO io = new FastIO();

        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            final int arrSize = io.nextInt();
            final int [] arr = new int[arrSize];
            for (int i = 0; i < arrSize; ++i)
                arr[i] = io.nextInt();

            int result = new MaxAreaHistogramSolver().solve(arr);
            System.out.println(result);
        }
    }
}

class MaxAreaHistogramSolver {

    int solve(final int [] arr) {
        final Deque<Integer> stack = new LinkedList<>();
        int maxArea = Integer.MIN_VALUE;

        int i = 0;
        while (i < arr.length) {
            if (stack.isEmpty() || arr[stack.peekFirst()] <= arr[i]) {
                stack.offerFirst(i++);
            } else {
                int top = stack.pollFirst();

                int area;
                if (stack.isEmpty()) {
                    area = arr[top] * i;
                } else {
                    area = arr[top] * (i - stack.peekFirst() - 1);
                }

                maxArea = Math.max(maxArea, area);
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pollFirst();

            int area;
            if (stack.isEmpty()) {
                area = arr[top] * i;
            } else {
                area = arr[top] * (i - stack.peekFirst() - 1);
            }

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}

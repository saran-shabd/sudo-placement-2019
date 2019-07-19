package stack;

import misc.FastIO;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MaxAreaInMatrix {

    public static void main(String[] args) {
        final FastIO io = new FastIO();

        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            final int rows = io.nextInt();
            final int cols = io.nextInt();
            final int [][] arr = new int[rows][cols];
            for (int i = 0; i < rows; ++i)
                for (int j = 0; j < cols; ++j)
                    arr[i][j] = io.nextInt();

            int result = new MaxAreaInMatrixSolver().solve(arr);
            System.out.println(result);
        }
    }
}

class MaxAreaInMatrixSolver {

    int solve(final int [][] arr) {
        int maxArea = 0;
        final int [] buffer = new int[arr[0].length];
        Arrays.fill(buffer, 0);

        for (int [] rows : arr) {
            for (int i = 0; i < rows.length; ++i) {
                if (0 == rows[i])
                    buffer[i] = 0;
                else
                    buffer[i] += rows[i];
            }

            int currArea = maxAreaHistogram(buffer);
            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;
    }

    private int maxAreaHistogram(final int [] arr) {
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

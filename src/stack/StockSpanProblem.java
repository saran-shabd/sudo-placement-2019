package stack;

import misc.FastIO;
import java.util.Stack;

public class StockSpanProblem {

    public static void main(String [] args) {
        final FastIO io = new FastIO();

        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            final int arrSize = io.nextInt();
            final int [] days = new int[arrSize];
            for (int i = 0; i < arrSize; ++i)
                days[i] = io.nextInt();

            final int [] result = new StockSpanProblemSolver().solve(days);
            for (int item : result)
                System.out.print(item + " ");
            System.out.println();
        }
    }
}

class StockSpanProblemSolver {

    int [] solve(final int [] days) {
        final int [] result = new int[days.length];
        result[0] = 1;

        final Stack<Integer> items = new Stack<>();
        items.push(0);

        for (int i = 1; i < days.length; ++i) {
            while (!items.empty() && days[items.peek()] <= days[i])
                items.pop();

            if (items.empty())
                result[i] = i + 1;
            else
                result[i] = i - items.peek();

            items.push(i);
        }

        return result;
    }
}

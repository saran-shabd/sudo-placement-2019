package stack;

import misc.FastIO;
import java.util.Stack;

public class EvaluatePostFixExp {

    public static void main(String [] args) {
        final FastIO io = new FastIO();

        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            final String expr = io.next();

            final int result = new EvaluatePostFixExpSolver().solve(expr);
            System.out.println(result);
        }
    }
}

class EvaluatePostFixExpSolver {

    int solve(final String expr) {
        Stack<Integer> nums = new Stack<>();

        for (char item : expr.toCharArray()) {
            if (Character.isDigit(item)) {
                nums.push(item - '0');
            } else {
                int num1 = nums.pop();
                int num2 = nums.pop();

                int result = 0;
                if (item == '*')
                    result = num2 * num1;
                else if (item == '/')
                    result = num2 / num1;
                else if (item == '+')
                    result = num2 + num1;
                else if (item == '-')
                    result = num2 - num1;

                nums.push(result);
            }
        }

        return nums.pop();
    }
}

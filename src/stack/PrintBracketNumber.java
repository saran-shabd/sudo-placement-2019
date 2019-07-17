package stack;

import misc.FastIO;
import misc.Pair;
import java.util.Stack;

public class PrintBracketNumber {

    public static void main(String [] args) {
        final FastIO io = new FastIO();

        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            final String expr = io.next();

            final String result = new PrintBracketNumberSolver().solve(expr);
            System.out.println(result);
        }
    }
}

class PrintBracketNumberSolver {

    String solve(final String expr) {
        final StringBuilder result = new StringBuilder();

        Stack<Pair<Integer, Character>> brackets = new Stack<>();

        int index = 1;
        for (char item : expr.toCharArray()) {
            if (item == '{' || item == '(' || item == '[') {
                brackets.push(new Pair<>(index, item));
                result.append(index);
                result.append(" ");
                ++index;
            } else {
                if (
                        (item == '}' && brackets.peek().second == '{') ||
                        (item == ')' && brackets.peek().second == '(') ||
                        (item == ']' && brackets.peek().second == '[')
                ) {
                    int tempIndex = brackets.pop().first;
                    result.append(tempIndex);
                    result.append(" ");
                }
            }
        }

        return result.toString();
    }
}

package stack;

import misc.FastIO;
import java.util.Stack;

public class ParenthesisChecker {

    public static void main(String [] args) {
        final FastIO io = new FastIO();

        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            final String exp = io.next();

            final boolean result = new ParenthesisCheckerSolver().solve(exp.toCharArray());
            if (result)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        }
    }
}

class ParenthesisCheckerSolver {

    boolean solve(final char [] exp) {
        if (null == exp || 0 == exp.length)
            return true;

        if (0 != exp.length % 2)
            return false;

        Stack<Character> items = new Stack<>();
        items.push(exp[0]);

        for (int i = 1; i < exp.length; ++i) {
            if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[') {
                items.push(exp[i]);
            } else {
                if (items.empty())
                    return false;

                char opener = items.pop();
                if (exp[i] == ')' && opener != '(')
                    return false;
                if (exp[i] == '}' && opener != '{')
                    return false;
                if (exp[i] == ']' && opener != '[')
                    return false;
            }
        }

        if (0 != items.size())
            return false;

        return true;
    }
}

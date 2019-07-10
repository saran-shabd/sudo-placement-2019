package strings;

import fastIO.FastIO;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ReverseWord {

    public static void main(String[] args) {
        final FastIO io = new FastIO();
        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            String str = io.next();
            String result = new ReverseWordSolver().solve(str);
            System.out.println(result);
        }
    }
}

class ReverseWordSolver {

    String solve(String str) {
        StringTokenizer st = new StringTokenizer(str, ".");
        ArrayList<String> words = new ArrayList<>();
        while (st.hasMoreElements())
            words.add(st.nextToken());

        StringBuilder result = new StringBuilder();
        for (int i = words.size() - 1; i > 0; --i) {
            result.append(words.get(i));
            result.append(".");
        }
        result.append(words.get(0));

        return result.toString();
    }
}

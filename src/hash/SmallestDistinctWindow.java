package hash;

import misc.FastIO;
import java.util.HashMap;

public class SmallestDistinctWindow {

    public static void main(String [] args) {
        final FastIO io = new FastIO();

        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            final String str = io.next();

            int result = new SmallestDistinctWindowSolver().solve(str.toCharArray());
            System.out.println(result);
        }
    }
}

class SmallestDistinctWindowSolver {

    int solve(final char [] str) {
        final HashMap<Character, Integer> uniques = new HashMap<>();
        for (char item : str)
            if (!uniques.containsKey(item))
                uniques.put(item, 0);

        int startIndex = 0, uniquesCount = 0;
        int endIndex = 0;
        for (; endIndex < str.length && uniquesCount < uniques.size(); ++endIndex) {
            if (uniques.get(str[endIndex]) == 0) {
                uniques.replace(str[endIndex], 1);
                ++uniquesCount;
            } else {
                uniques.replace(str[endIndex], uniques.get(str[endIndex])  + 1);
            }
        }

        int currLength = endIndex, minLength = endIndex;
        char missing = '\0';
        while (endIndex < str.length) {
            --currLength;
            if (uniques.get(str[startIndex]) == 1) {
                uniques.replace(str[startIndex], 0);
                missing = str[startIndex];
                ++startIndex;
            } else {
                minLength = Integer.min(minLength, currLength);
                uniques.replace(str[startIndex], uniques.get(str[startIndex]) - 1);
                ++startIndex;
                missing = '\0';
                continue;
            }

            if (endIndex == str.length - 1) {
                if (missing == '\0')
                    minLength = Integer.min(minLength, currLength);

                if (str[endIndex] == missing) {
                    ++currLength;
                    minLength = Integer.min(minLength, currLength);
                }

                break;
            }

            while (endIndex < str.length) {
                ++currLength;

                if (missing == str[endIndex]) {
                    uniques.replace(str[endIndex], 1);
                    missing = '\0';
                    ++endIndex;
                    break;
                }

                uniques.replace(str[endIndex], uniques.get(str[endIndex]) + 1);
                ++endIndex;
            }

            minLength = Integer.min(minLength, currLength);
        }

        while (uniques.get(str[startIndex]) > 1 && missing == '\0') {
            uniques.replace(str[startIndex], uniques.get(str[startIndex]) - 1);
            ++startIndex;
            --currLength;
        }

        if (missing == '\0')
            minLength = Integer.min(minLength, currLength);

        return minLength;
    }
}

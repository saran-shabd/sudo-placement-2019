package arraysAndSearching;

import misc.FastIO;

public class LongestCommonPrefixInAnArray {

    public static void main(String [] args) {
        final FastIO io = new FastIO();
        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            final int n = io.nextInt();
            final String [] arr = new String[n];
            for (int i = 0; i < n; ++i)
                arr[i] = io.next();
            String result = new LongestCommonPrefixInAnArraySolver().solve(arr);
            System.out.println(result);
        }
    }
}

class LongestCommonPrefixInAnArraySolver {

    String solve(String [] arr) {
        int index = arr[0].length() - 1;
        for (int i = 1; i < arr.length; ++i) {
            int commonIndex = -1;
            for (int j = 0; j < Integer.min(index, arr[i].length() - 1) + 1; ++j) {
                if (arr[i - 1].charAt(j) != arr[i].charAt(j))
                    break;
                commonIndex += 1;
            }

            index = commonIndex;
            if (-1 == index)
                break;
        }

        if (-1 == index)
            return "-1";

        char [] tempArr = arr[0].toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= index; ++i)
            result.append(tempArr[i]);
        return result.toString();
    }
}

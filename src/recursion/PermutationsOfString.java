package recursion;

import misc.FastIO;
import java.util.Arrays;

public class PermutationsOfString {

    public static void main(String [] args) {
        final FastIO io = new FastIO();

        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            final String str = io.next();

            String result = new PermutationsOfStringSolver().solve(str);
            System.out.println(result);
        }
    }
}

class PermutationsOfStringSolver {
    private StringBuilder result;

    PermutationsOfStringSolver() {
        result = new StringBuilder();
    }

    String solve(final String str) {
        helper(str, 0, str.length() - 1);
        String [] resultArr = result.toString().split(" ");
        Arrays.sort(resultArr);

        StringBuilder finalResult = new StringBuilder();
        for (String item : resultArr) {
            finalResult.append(item);
            finalResult.append(" ");
        }
        return finalResult.toString();
    }

    private void helper(String str, int left, int right) {
        if (left == right) {
            result.append(str);
            result.append(" ");
            return;
        }

        for (int i = left; i <= right; ++i) {
            str = swap(str, left, i);
            helper(str, left + 1, right);
            str = swap(str, left, i);
        }
    }

    private String swap(String str, int left, int right) {
        char [] arr = str.toCharArray();

        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        return String.valueOf(arr);
    }
}

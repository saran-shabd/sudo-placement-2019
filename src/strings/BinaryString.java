package strings;

import fastIO.FastIO;

public class BinaryString {

    public static void main(String[] args) {
        final FastIO io = new FastIO();
        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            int n = io.nextInt();
            String str = io.next();
            int result = new BinaryStringSolver().solve(str);
            System.out.println(result);
        }
    }
}

class BinaryStringSolver {

    int solve(String str) {
        int ones = count1s(str.toCharArray());
        int result = 0;
        while (0 != ones)
            result += --ones;
        return result;
    }

    private int count1s(char [] str) {
        int count = 0;
        for (char item : str)
            if (item == '1')
                ++count;
        return count;
    }
}

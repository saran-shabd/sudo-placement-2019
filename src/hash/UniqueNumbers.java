package hash;

import fastIO.FastIO;

public class UniqueNumbers {

    public static void main(String[] args) {
        final FastIO io = new FastIO();

        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            final int startNum = io.nextInt();
            final int endNum = io.nextInt();

            String result = new UniqueNumbersSolver().solve(startNum, endNum);
            System.out.println(result);
        }
    }
}

class UniqueNumbersSolver {

    String solve(int startNum, int endNum) {
        StringBuilder result = new StringBuilder();

        for (int i = startNum; i <= endNum; ++i) {
            boolean [] nums = new boolean[10];
            int temp = i;

            boolean areUnique = true;
            while (0 != temp) {
                int digit = temp % 10;
                temp /= 10;

                if (nums[digit]) {
                    areUnique = false;
                    break;
                } else {
                    nums[digit] = true;
                }
            }

            if (areUnique) {
                result.append(i);
                result.append(" ");
            }
        }

        return result.toString();
    }
}

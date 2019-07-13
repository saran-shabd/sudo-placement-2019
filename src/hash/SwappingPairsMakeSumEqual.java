package hash;

import fastIO.FastIO;

import java.util.HashSet;

public class SwappingPairsMakeSumEqual {

    public static void main(String[] args) {
        final FastIO io = new FastIO();

        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            final int arr1Size = io.nextInt();
            final int arr2Size = io.nextInt();

            final int [] arr1 = new int[arr1Size];
            for (int i = 0; i < arr1Size; ++i)
                arr1[i] = io.nextInt();

            final int [] arr2 = new int[arr2Size];
            for (int i = 0; i < arr2Size; ++i)
                arr2[i] = io.nextInt();

            boolean result = new SwappingPairsMakeSumEqualSolver().solve(arr1, arr2);
            if (result)
                System.out.println(1);
            else
                System.out.println(-1);
        }
    }
}

class SwappingPairsMakeSumEqualSolver {

    boolean solve(int [] arr1, int [] arr2) {
        HashSet<Integer> elements = new HashSet<>();
        for (int item : arr1)
            elements.add(item);

        int sum1 = 0, sum2 = 0;
        for (int item : arr1)
            sum1 += item;
        for (int item : arr2)
            sum2 += item;

        for (int item : arr2) {
            int temp = (sum1 - sum2 + 2*item) / 2;
            if (elements.contains(temp))
                return true;
        }

        return false;
    }
}

package hash;

import fastIO.FastIO;

import java.util.HashSet;

public class ArraySubsetOfAnotherArray {

    public static void main(String[] args) {
        FastIO io = new FastIO();
        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            int arr1Size = io.nextInt();
            int arr2Size = io.nextInt();
            int [] arr1 = new int[arr1Size];
            int [] arr2 = new int[arr2Size];
            for (int i = 0; i < arr1Size; ++i)
                arr1[i] = io.nextInt();
            for (int i = 0; i < arr2Size; ++i)
                arr2[i] = io.nextInt();
            boolean result = new ArraySubsetOfAnotherArraySolver().solve(arr1, arr2);
            if (result)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}

class ArraySubsetOfAnotherArraySolver {

    boolean solve(int [] arr1, int [] arr2) {
        HashSet<Integer> arr1Elements = new HashSet<>();
        for (int item : arr1)
            arr1Elements.add(item);
        for (int item : arr2)
            if (!arr1Elements.contains(item))
                return false;
        return true;
    }
}

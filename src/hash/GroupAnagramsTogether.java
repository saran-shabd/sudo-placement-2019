package hash;

import misc.FastIO;

import java.util.*;

public class GroupAnagramsTogether {

    public static void main(String[] args) {
        FastIO io = new FastIO();
        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            int n = io.nextInt();
            String [] words = new String[n];
            for (int i = 0; i < n; ++i)
                words[i] = io.next();
            String result = new GroupAnagramsTogetherSolver().solve(words);
            System.out.println(result);
        }
    }
}

class GroupAnagramsTogetherSolver {

    String solve(String [] words) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (String word : words) {
            int value = 0;
            for (char item : word.toCharArray())
                value += ((int) item * (int) item);
            if (counts.containsKey(value))
                counts.replace(value, counts.get(value) + 1);
            else
                counts.put(value, 1);
        }
        PriorityQueue<Integer> results = new PriorityQueue<>();
        for (Map.Entry<Integer, Integer> item : counts.entrySet())
            results.add(item.getValue());
        StringBuilder result = new StringBuilder();
        while (!results.isEmpty()) {
            result.append(results.poll());
            result.append(" ");
        }
        return result.toString();
    }
}

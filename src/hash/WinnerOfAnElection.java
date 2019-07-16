package hash;

import misc.FastIO;

import java.util.HashMap;
import java.util.Map;

public class WinnerOfAnElection {

    public static void main(String[] args) {
        FastIO io = new FastIO();
        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            int n = io.nextInt();
            String [] arr = new String[n];
            for (int i = 0; i < n; ++i)
                arr[i] = io.next();
            String result = new WinnerOfAnElectionSolver().solve(arr);
            System.out.println(result);
        }
    }
}

class WinnerOfAnElectionSolver {

    String solve(String [] arr) {
        HashMap<String, Integer> votes = new HashMap<>();
        for (String item : arr) {
            if (votes.containsKey(item))
                votes.replace(item, votes.get(item) + 1);
            else
                votes.put(item, 1);
        }
        int maxVotes = 0;
        String winner = "";
        for (Map.Entry<String, Integer> item : votes.entrySet()) {
            if (item.getValue() > maxVotes) {
                maxVotes = item.getValue();
                winner = item.getKey();
            } else if (item.getValue() == maxVotes && item.getKey().compareTo(winner) < 1) {
                winner = item.getKey();
            }
        }
        return winner + " " + maxVotes;
    }
}

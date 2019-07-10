package arraysAndSearching;

import fastIO.FastIO;
import java.util.Arrays;
import java.util.HashSet;

public class SuperPrimes {

    public static void main(String[] args) {
        final FastIO io = new FastIO();
        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            final int n = io.nextInt();
            int result = new SuperPrimesSolver().solve(n);
            System.out.println(result);
        }
    }
}

class SuperPrimesSolver {

    int solve(final int n) {
        int [] primes = getPrimes(n - 1);
        HashSet<Integer> primeSet = new HashSet<>();
        for (int item : primes)
            primeSet.add(item);
        boolean [][] visited = new boolean[primes.length][primes.length];

        int count = 0;
        for (int i = 0; i < primes.length; ++i) {
            for (int j = 0; j < primes.length; ++j) {
                if (i != j && !visited[j][i]) {
                    if (primeSet.contains(primes[i] + primes[j])) {
                        visited[i][j] = true;
                        ++count;
                    }
                }
            }
        }

        return count;
    }

    private int [] getPrimes(final int n) {
        boolean [] primeNos = new boolean[n+1];
        Arrays.fill(primeNos, true);

        for (int i = 2; i*i <= n; ++i)
            if (primeNos[i])
                for (int j = i*2; j <= n; j += i)
                    primeNos[j] = false;

        int primeCount = 0;
        for (int i = 1; i <= n; ++i)
            if (primeNos[i])
                ++primeCount;

        int [] primes = new int[primeCount];
        primeCount = 0;
        for (int i = 1; i <= n; ++i) {
            if (primeNos[i]) {
                primes[primeCount] = i;
                ++primeCount;
            }
        }

        return primes;
    }
}

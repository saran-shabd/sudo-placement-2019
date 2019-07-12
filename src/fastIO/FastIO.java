package fastIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class FastIO {
    private final BufferedReader br;
    private StringTokenizer st;

    public FastIO() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String next() {
        while (st == null || !st.hasMoreElements()) {
            try{
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) { e.printStackTrace(); }
        }
        return st.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public BigInteger nextBigInteger() {
        return new BigInteger(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) { e.printStackTrace(); }
        return str;
    }
}

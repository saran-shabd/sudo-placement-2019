package strings;

import misc.FastIO;
import java.util.StringTokenizer;

public class ValidateIPAddress {

    public static void main(String[] args) {
        FastIO io = new FastIO();
        for (int testcase = io.nextInt(); testcase > 0; --testcase) {
            String ip = io.next();
            boolean result = new ValidateIPAddressSolver().solve(ip);
            if (result)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}

class ValidateIPAddressSolver {

    boolean solve(String ip) {
        if (ip.charAt(ip.length() - 1) == '.')
            return false;
        StringTokenizer st = new StringTokenizer(ip, ".");
        if (4 != st.countTokens())
            return false;
        int [] words = new int[4];
        for (int i = 0; i < 4; ++i) {
            try {
                String temp = st.nextToken();
                if (temp.charAt(0) == '0' && temp.length() > 1)
                    return false;
                words[i] = Integer.parseInt(temp);
            } catch (Exception e) { return false; }
        }

        for (int item : words)
            if (item < 0 || item > 255)
                return false;
        return true;
    }
}

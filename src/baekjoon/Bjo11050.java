package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bjo11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int[] number = Arrays.stream(buf.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(binomial(number[0], number[1]));
    }

    static int binomial(int n, int k) {
        if (n == k || k == 0) {
            return 1;
        }
        else {
            return binomial(n - 1, k) + binomial(n - 1, k - 1);
        }
    }
}
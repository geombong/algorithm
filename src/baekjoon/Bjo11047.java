package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bjo11047 {
    public static void main(String[] args) throws IOException {

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(buf.readLine(), " ");

        int coinCount = Integer.parseInt(str.nextToken());
        int cashAmount = Integer.parseInt(str.nextToken());

        int[] coin = new int[coinCount];

        for (int i = 0; i < coinCount; i++) {
            coin[i] = Integer.parseInt(buf.readLine());
        }

        int count = 0;

        for (int i = coinCount - 1; i >= 0; i--) {
            if (coin[i] <= cashAmount) {
                count += (cashAmount / coin[i]);
                cashAmount %= coin[i];
            }
        }
        System.out.println(count);
    }
}
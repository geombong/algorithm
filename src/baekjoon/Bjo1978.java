package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bjo1978 {
    public static void main(String[] args) throws IOException {

        List<Integer> numbers = new ArrayList<>();
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        buf.readLine();

        StringTokenizer st = new StringTokenizer(buf.readLine(), " ");

        int isPrimeCount = 0;
        boolean isPrime;

        while (st.hasMoreTokens()) {
            numbers.add(Integer.parseInt(st.nextToken()));
        }
        for (Integer number : numbers) {
            isPrime = true;
            if (number % 2 == 0 || number == 1) {
                if (number == 2) {
                    isPrimeCount++;
                }
                continue;
            }
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                isPrimeCount++;
            }
        }
        System.out.println(isPrimeCount);
    }
}
package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bjo11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(buf.readLine());

        for (int i = 0; i < count; i++) {
            String inputNumber = buf.readLine();

            Integer result = Arrays.stream(inputNumber.split(" "))
                    .map(Integer::parseInt)
                    .reduce(0, Integer::sum);

            System.out.printf("Case #%d: %s + %s = %d%n", i + 1, inputNumber.charAt(0), inputNumber.charAt(2), result);
        }
    }
}
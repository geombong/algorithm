package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bjo10953 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(buf.readLine());
        for (int i = 0; i < count; i++) {
            String number = buf.readLine();
            Integer value = Arrays.stream(number.split(","))
                    .map(Integer::parseInt)
                    .reduce(0, Integer::sum);
            System.out.println(value);
        }
    }
}
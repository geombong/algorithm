package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bjo10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(buf.readLine());
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(buf.readLine());
        }

        Arrays.sort(numbers);

        for (int number : numbers) {
            sb.append(number).append('\n');
        }

        System.out.println(sb);
    }
}
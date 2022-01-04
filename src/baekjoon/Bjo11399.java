package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bjo11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int numberOfPeople = Integer.parseInt(buf.readLine());

        int[] numbers = Arrays.stream(buf.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        int[] value = new int[numberOfPeople];

        for (int i = 0; i < numberOfPeople; i++) {
            int tmp = 0;
            for (int j = 0; j <= i; j++) {
                tmp += numbers[j];
            }
            value[i] = tmp;
        }
        int result = Arrays.stream(value).reduce(0, Integer::sum);
        System.out.println(result);
    }
}
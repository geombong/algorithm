package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bjo2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(buf.readLine(), " ");

        Integer result = solve(buf, str);
        System.out.println(result);
    }

    private static Integer solve(BufferedReader buf, StringTokenizer str) throws IOException {
        int numberCount = Integer.parseInt(str.nextToken());
        int number = Integer.parseInt(str.nextToken());
        int result = 0;
        int[] numbers = Arrays.stream(buf.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < numberCount - 2; i++) {
            if (numbers[i] > number) {
                continue;
            }
            for (int j = i + 1; j < numberCount - 1; j++) {
                if (numbers[i] + numbers[j] > number) {
                    continue;
                }
                for (int k = j + 1; k < numberCount; k++) {
                    int value = numbers[i] + numbers[j] + numbers[k];

                    if (value < number && value > result) {
                        result = value;
                    }
                    if (value == number) {
                        result = value;
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bjo1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int[] number = Arrays.stream(buf.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> value = new ArrayList<>();

        for (int i = 0; i < number.length; i++) {
            if (i < 2) {
                value.add(number[i]);
                continue;
            }
            value.add(number[i] - number[i - 2]);
        }

        System.out.println(value.stream().reduce(Integer::min).orElse(0));
    }
}
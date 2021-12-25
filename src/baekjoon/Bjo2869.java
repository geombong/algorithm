package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bjo2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int[] value = Arrays.stream(buf.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int up = value[0];
        int down = value[1];
        int height = value[2];
        int day = (height - down) / (up - down);

        if ((height - down) % (up - down) != 0) {
            day++;
        }
        System.out.println(day);
    }
}
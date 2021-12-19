package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bjo2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bf.readLine());

        int count = 1;
        int range = 2;

        if (number == 1) {
            System.out.println(count);
            return;
        }

        while (range <= number) {
            range = range + (6 * count);
            count++;
        }
        System.out.println(count);
    }
}
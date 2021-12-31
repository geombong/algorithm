package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Bjo2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();

        int count = Integer.parseInt(buf.readLine());

        for (int i = 0; i < count; i++) {
            numbers.add(Integer.parseInt(buf.readLine()));
        }

        numbers.stream().sorted().forEach(System.out::println);
    }
}
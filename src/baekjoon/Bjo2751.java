package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Bjo2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        List<Long> numbers = new ArrayList<>();
        int count = Integer.parseInt(buf.readLine());

        for (int i = 0; i < count; i++) {
            numbers.add(Long.parseLong(buf.readLine()));
        }
        StringBuilder sb = new StringBuilder();
        numbers.stream()
                .sorted()
                .forEach(s -> sb.append(s).append('\n'));
        System.out.println(sb);
    }
}
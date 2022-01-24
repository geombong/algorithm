package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bjo10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(buf.readLine());
        int number;
        Stack<Integer> numbers = new Stack<>();

        for (int i = 0; i < count; i++) {
            number = Integer.parseInt(buf.readLine());
            if (number == 0) {
                numbers.pop();
                continue;
            }
            numbers.push(number);
        }
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bjo2558 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(buf.readLine());
        int b = Integer.parseInt(buf.readLine());

        System.out.println(a + b);
    }
}

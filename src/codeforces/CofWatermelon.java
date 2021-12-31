package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CofWatermelon  {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buf.readLine());

        if (number % 2 == 0 && number != 2) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
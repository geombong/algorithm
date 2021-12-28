package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bjo9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(buf.readLine());
        Stack<String> strings;
        boolean flag;

        for (int i = 0; i < count; i++) {
            String ps = buf.readLine();
            flag = true;
            strings = new Stack<>();
            for (int j = 0; j < ps.length(); j++) {
                if (ps.charAt(j) == '(') {
                    strings.push("(");
                }
                if (strings.empty()) {
                    System.out.println("NO");
                    flag = false;
                    break;
                }
                if (ps.charAt(j) == ')') {
                    strings.pop();
                }
            }
            if (!strings.empty()) {
                System.out.println("NO");
            }
            if ((strings.empty() && flag)) {
                System.out.println("YES");
            }
        }
    }
}
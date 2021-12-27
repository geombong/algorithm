package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Bjo10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> integerStack = new Stack<>();

        int numberOfCommands = Integer.parseInt(buf.readLine());

        for (int i = 0; i < numberOfCommands; i++) {
            StringTokenizer str = new StringTokenizer(buf.readLine(), " ");
            String command = str.nextToken();
            if (str.hasMoreTokens()) {
                String pushNumber = str.nextToken();
                integerStack.push(String.valueOf(pushNumber));
            }

            if (command.equals("top")) {
                if (integerStack.isEmpty()) {
                    System.out.println(-1);
                    continue;
                }
                System.out.println(integerStack.peek());
            }
            if (command.equals("size")) {
                System.out.println(integerStack.size());
            }
            if (command.equals("pop")) {
                if (integerStack.isEmpty()) {
                    System.out.println(-1);
                    continue;
                }
                System.out.println(integerStack.pop());
            }
            if (command.equals("empty")) {
                if (integerStack.isEmpty()) {
                    System.out.println(1);
                    continue;
                }
                System.out.println(0);
            }
        }
    }
}
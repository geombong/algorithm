package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class CorrectParenthesis {

    static class Main {
        public String solution(String parenthesis) {
            String answer = "YES";
            Stack<Character> stack = new Stack<>();
            char[] chars = parenthesis.toCharArray();
            if ((chars[0] == ')' || chars[chars.length - 1] == '(')) {
                answer = "NO";
                return answer;
            }

            for (char c : parenthesis.toCharArray()) {
                if (stack.isEmpty()) {
                    stack.push(c);
                } else if (!stack.peek().equals(c)) {
                    stack.pop();
                } else if (stack.peek().equals(c)) {
                    stack.push(c);
                }
            }
            if (!stack.isEmpty()) {
                answer = "NO";
                return answer;
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReadr = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            Main main = new Main();
            String parenthesis = bufferedReadr.readLine();

            String result = main.solution(parenthesis);

            bufferedReadr.close();

            bufferedWriter.write(result);
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}

package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Enumeration;
import java.util.Stack;

public class RemoveParentheses {
    static class Main {
        public Stack<Character> solution(String str) {
            Stack<Character> answer = new Stack<>();
            char[] chars = str.toCharArray();
            for (char c : chars) {
                if (c != ')') {
                    answer.push(c);
                } else {
                    while (c != '(') {
                        answer.pop();
                        c = answer.peek();
                    }
                    answer.pop();
                }
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder stringBuilder = new StringBuilder();
            Main main = new Main();

            String str = bufferedReader.readLine();
            Stack<Character> result = main.solution(str);

            Enumeration<Character> elements = result.elements();

            while (elements.hasMoreElements()) {
                stringBuilder.append(elements.nextElement());
            }

            bufferedReader.close();

            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}

package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class IronStick {

    static class Main {
        public int solution(String parentheses) {
            int answer = 0;
            Stack<Character> characterStack = new Stack<>();
            char[] ch = parentheses.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == '(') {
                    characterStack.push(ch[i]);
                } else {
                    characterStack.pop();
                    if (ch[i - 1] == '(') {
                        answer += characterStack.size();
                    } else {
                        answer++;
                    }
                }
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

            Main main = new Main();
            String parentheses = bufferedReader.readLine();
            int result = main.solution(parentheses);

            bufferedReader.close();

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}

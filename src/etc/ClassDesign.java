package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class ClassDesign {

    static class Main {
        public String solution(String subject, String lesson) {
            String answer = "NO";
            Stack<Character> subjectStack = new Stack<>();
            char[] subjects = subject.toCharArray();
            for (int i = subjects.length - 1; i >= 0; i--) {
                subjectStack.push(subjects[i]);
            }
            char[] lessons = lesson.toCharArray();
            for (int i = 0; i < lesson.length(); i++) {
                if (lessons[i] == subjectStack.peek()) {
                    subjectStack.pop();
                }
                if (subjectStack.isEmpty()) {
                    answer = "YES";
                    break;
                }
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            Main main = new Main();

            String subject = bufferedReader.readLine();
            String lesson = bufferedReader.readLine();

            String result = main.solution(subject, lesson);

            bufferedReader.close();

            bufferedWriter.write(result);
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}

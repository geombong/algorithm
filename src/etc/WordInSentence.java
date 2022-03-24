package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordInSentence {
    static class Main {
        public String solution(String sentence) {
            String answer = "";
            String[] store = sentence.split(" ");
            for (String s : store) {
                if (s.length() > answer.length()) {
                    answer = s;
                }
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

            String sentence = buf.readLine();
            Main main = new Main();
            String result = main.solution(sentence);
            System.out.println(result);
        }
    }
}

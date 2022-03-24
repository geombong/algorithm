package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class WordReverse {

    static class Main {
        public String[] solution(String[] words) {
            String[] answer = new String[words.length];
            for (int i = 0; i < words.length; i++) {
                String reverseWord = new StringBuilder(words[i])
                        .reverse()
                        .toString();
                answer[i] = reverseWord;
            }
            return answer;
        }

        public List<String> solution2(String[] words) {
            List<String> answer = new ArrayList<>();
            for (var word : words) {
                char[] ch = word.toCharArray();
                int lt = 0, rt = ch.length - 1;
                while (lt < rt) {
                    char tmp = ch[lt];
                    ch[lt] = ch[rt];
                    ch[rt] = tmp;
                    lt++;
                    rt--;
                }
                answer.add(String.copyValueOf(ch));
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            int wordCount = Integer.parseInt(buf.readLine());
            String[] words = new String[wordCount];

            for (int i = 0; i < wordCount; i++) {
                words[i] = buf.readLine();
            }

            Main main = new Main();
            String[] result = main.solution(words);
            for (String s : result) {
                System.out.println("solution1: " + s);
            }
            List<String> result2 = main.solution2(words);
            for (String s : result2) {
                System.out.println("solution2: " + s);
            }
        }
    }
}

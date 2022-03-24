package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseSpecificChar {
    static class Main {
        public String solution(String s) {
            String answer = "";
            char[] ch = s.toCharArray();

            int lt = 0;
            int rt = s.length() - 1;
            while (lt < rt) {
                if (!Character.isAlphabetic(ch[lt])) {
                    lt++;
                } else if (!Character.isAlphabetic(ch[rt])) {
                    rt--;
                } else {
                    char tmp = ch[lt];
                    ch[lt] = ch[rt];
                    ch[rt] = tmp;
                    lt++;
                    rt--;
                }
            }
            answer = String.copyValueOf(ch);
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            Main main = new Main();

            String word = buf.readLine();
            String result = main.solution(word);

            System.out.println(result);
        }
    }
}

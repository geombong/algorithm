package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class ValidPalindrome {
    static class Main {
        public String solution(String str) {
            String answer = "YES";
            char[] chars = str.toLowerCase(Locale.ROOT).toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (!Character.isAlphabetic(chars[i])) {
                    chars[i] = ' ';
                }
            }
            String tmp = String.copyValueOf(chars).replaceAll(" ", "");
            char[] tmpChar = tmp.toCharArray();
            int lt = 0;
            int rt = tmp.length() - 1;
            while (lt < rt) {
                if (tmpChar[lt] != tmpChar[rt]) {
                    answer = "NO";
                    break;
                }
                lt++;
                rt--;
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            Main main = new Main();

            String str = bufferedReader.readLine();
            String result = main.solution(str);

            System.out.println(result);
        }
    }
}

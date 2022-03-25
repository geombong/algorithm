package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Palindrome {
    static class Main {
        public String solution(String str) {
            String answer = "YES";
            char[] chars = str.toLowerCase(Locale.ROOT).toCharArray();
            int lt = 0;
            int rt = str.length() - 1;
            while (lt < rt) {
                if (chars[lt] != chars[rt]) {
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

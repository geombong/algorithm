package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpperLowerChange {

    static class Main {
        public String solution(String str) {
            StringBuilder sb = new StringBuilder();
            String answer;
            for (char c : str.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
            answer = sb.toString();
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            String str = buf.readLine();
            Main main = new Main();
            String result = main.solution(str);
            System.out.println(result);
        }
    }
}

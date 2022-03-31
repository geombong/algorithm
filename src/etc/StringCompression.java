package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCompression {
    static class Main {
        public String solution(String str) {
            String answer = "";
            StringBuilder stringBuilder = new StringBuilder();
            str += " ";
            char tmp = ' ';
            char[] chars = str.toCharArray();
            int count = 1;
            for (char ch : chars) {
                if (ch != tmp && count == 1) {
                    stringBuilder.append(ch);
                } else if (ch == tmp) {
                    count++;
                } else {
                    stringBuilder.append(count);
                    stringBuilder.append(ch);
                    count = 1;
                }
                tmp = ch;
            }
            answer = stringBuilder.toString();
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

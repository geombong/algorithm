package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumericalExtraction {
    static class Main {
        public int solution(String str) {
            int answer = 0;
            StringBuilder sb = new StringBuilder();
            char[] ch = str.toCharArray();
            for (char c : ch) {
                if (Character.isDigit(c)) {
                    sb.append(c);
                }
            }
            answer = Integer.parseInt(sb.toString());
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String str = bufferedReader.readLine();
            Main main = new Main();
            int result = main.solution(str);

            System.out.println(result);
        }
    }
}

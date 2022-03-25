package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DuplicateString {
    static class Main {
        public String solution(String str) {
            String answer = "";
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (str.indexOf(str.charAt(i)) == i) {
                    stringBuilder.append(str.charAt(i));
                }
            }
            answer = stringBuilder.toString();
            return answer;
        }


        public static void main(String[] args) throws IOException {
            Main main = new Main();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String str = bufferedReader.readLine();
            String result = main.solution(str);

            System.out.println(result);
        }
    }
}

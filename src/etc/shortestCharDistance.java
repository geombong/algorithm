package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class shortestCharDistance {
    static class Main {
        public int[] solution(String string, char character) {
            int[] answer = new int[string.length()];
            int stringMaxLength = 1000;
            char[] chars = string.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == character) {
                    stringMaxLength = 0;
                    answer[i] = stringMaxLength;
                } else {
                    answer[i] = ++stringMaxLength;
                }
            }

            stringMaxLength = 1000;

            for (int i = chars.length - 1; i > -1; i--) {
                if (chars[i] == character) {
                    stringMaxLength = 0;
                    answer[i] = stringMaxLength;
                } else {
                    ++stringMaxLength;
                    if (answer[i] > stringMaxLength) {
                        answer[i] = stringMaxLength;
                    }
                }
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            StringBuilder stringBuilder = new StringBuilder();
            Main main = new Main();

            String string = stringTokenizer.nextToken();
            char character = stringTokenizer.nextToken().charAt(0);
            int[] result = main.solution(string, character);

            for (int i : result) {
                stringBuilder.append(i).append(" ");
            }
            
            System.out.print(stringBuilder.substring(0, stringBuilder.length() - 1));
        }
    }
}

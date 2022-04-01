package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Password {
    static class Main {
        public String solution(String str, int charCount) {
            String answer = "";
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < charCount; i++) {
                String tmp;
                tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
                int num = Integer.parseInt(tmp, 2);
                str = str.substring(7);
                stringBuilder.append((char) num);
            }
            answer = stringBuilder.toString();
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            Main main = new Main();

            int charCount = Integer.parseInt(bufferedReader.readLine());
            String str = bufferedReader.readLine();
            String result = main.solution(str, charCount);

            bufferedWriter.write(result + "\n");

            bufferedReader.close();

            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}

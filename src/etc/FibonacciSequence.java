package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FibonacciSequence {
    static class Main {
        public int[] solution(int number) {
            int[] answer = new int[number];

            answer[0] = 1;
            answer[1] = 1;

            for (int i = 2; i < number; i++) {
                answer[i] = answer[i - 2] + answer[i - 1];
            }
            return answer;
        }


        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder stringBuilder = new StringBuilder();
            Main main = new Main();

            int number = Integer.parseInt(bufferedReader.readLine());
            int[] results = main.solution(number);

            bufferedReader.close();

            for (int result : results) {
                stringBuilder.append(result).append(" ");
            }

            bufferedWriter.write(stringBuilder.substring(0, stringBuilder.length() - 1));
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}

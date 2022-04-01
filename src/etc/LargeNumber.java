package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class LargeNumber {
    static class Main {
        public List<Integer> solution(int numberCount, int[] numbers) {
            List<Integer> answer = new ArrayList<>();

            answer.add(numbers[0]);

            for (int i = 1; i < numberCount; i++) {
                if (numbers[i] > numbers[i - 1]) {
                    answer.add(numbers[i]);
                }
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder stringBuilder = new StringBuilder();
            StringTokenizer stringTokenizer;
            Main main = new Main();

            int numberCount = Integer.parseInt(bufferedReader.readLine());
            int[] numbers = new int[numberCount];

            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            for (int i = 0; i < numberCount; i++) {
                numbers[i] = Integer.parseInt(stringTokenizer.nextToken());
            }

            List<Integer> result = main.solution(numberCount, numbers);

            for (int i : result) {
                stringBuilder.append(i).append(" ");
            }

            bufferedReader.close();

            bufferedWriter.write(stringBuilder.substring(0, stringBuilder.length() - 1));
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}


package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class InsertSort {

    static class Main {
        public int[] solution(int countOfNumber, int[] numbers) {
            int[] answer = numbers;

            for (int i = 1; i < countOfNumber; i++) {
                int target = answer[i];
                int index = i - 1;
                while ((index >= 0) && (target < answer[index])) {
                    answer[index + 1] = answer[index];
                    index--;
                }
                answer[index + 1] = target;
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder stringBuilder = new StringBuilder();
            Main main = new Main();

            int countOfNumber = Integer.parseInt(bufferedReader.readLine());
            int[] numbers = new int[countOfNumber];

            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            for (int i = 0; i < countOfNumber; i++) {
                numbers[i] = Integer.parseInt(stringTokenizer.nextToken());
            }

            int[] result = main.solution(countOfNumber, numbers);

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

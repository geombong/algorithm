package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class MaximumPartialIncreasingSequence {

    static class Main {
        private int solution(int[] numbers) {
            int answer = 0;

            int[] maximumLength = new int[numbers.length];
            maximumLength[0] = 1;

            for (int i = 1; i < numbers.length; i++) {
                int tmp = 0;
                for (int j = i - 1; j >= 0; j--) {
                    if (numbers[j] < numbers[i] && maximumLength[j] > tmp) {
                        tmp = maximumLength[j];
                    }
                }
                maximumLength[i] = tmp + 1;
                answer = Math.max(answer, maximumLength[i]);
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            Main main = new Main();

            int number = Integer.parseInt(bufferedReader.readLine());
            int[] numbers = new int[number];
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            for (int i = 0; i < number; i++) {
                numbers[i] = Integer.parseInt(stringTokenizer.nextToken());
            }

            int result = main.solution(numbers);

            bufferedReader.close();

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}

package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class MaximumLengthContinuousSubsequence {

    static class Main {
        public int solution(int K, int[] numbers) {
            int answer = 0;
            int pointA = 0;
            int pointB = 1;
            int tmp = K;
            int max = 0;
            while (pointA < numbers.length && pointB < numbers.length) {
                if (numbers[pointA] == 0) {
                    numbers[pointA] = -1;
                    tmp--;
                    max++;
                } else if (numbers[pointA] == 1) {
                    max++;
                    numbers[pointA] = -1;
                }
                if (numbers[pointB] == 1) {
                    max++;
                } else if (tmp != 0) {
                    max++;
                    tmp--;
                } else {
                    pointA++;
                    answer = Math.max(answer, max);
                    max = 0;
                    tmp = K;
                    pointB = pointA + 1;
                    continue;
                }
                pointB++;
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int N = Integer.parseInt(stringTokenizer.nextToken());
            int K = Integer.parseInt(stringTokenizer.nextToken());

            int[] numbers = new int[N];
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            for (int i = 0; i < N; i++) {
                numbers[i] = Integer.parseInt(stringTokenizer.nextToken());
            }

            Main main = new Main();
            int result = main.solution(K, numbers);

            bufferedReader.close();

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.flush();

            bufferedWriter.close();
        }
    }
}

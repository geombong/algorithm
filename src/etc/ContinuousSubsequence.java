package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ContinuousSubsequence {

    static class Main {
        public int solution(int M, int[] numbers) {
            int answer = 0;

            for (int i = 0; i < numbers.length; i++) {
                int tmp = numbers[i];
                for (int j = i + 1; j < numbers.length; j++) {
                    tmp += numbers[j];
                    if (tmp > M) {
                        break;
                    }
                    if (tmp == M) {
                        answer++;
                        break;
                    }
                }
            }
            return answer;
        }


        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int N = Integer.parseInt(stringTokenizer.nextToken());
            int M = Integer.parseInt(stringTokenizer.nextToken());

            int[] numbers = new int[N];
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            for (int i = 0; i < N; i++) {
                numbers[i] = Integer.parseInt(stringTokenizer.nextToken());
            }

            Main main = new Main();
            int result = main.solution(M, numbers);

            bufferedReader.close();

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.flush();

            bufferedWriter.close();
        }
    }
}

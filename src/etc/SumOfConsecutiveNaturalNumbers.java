package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SumOfConsecutiveNaturalNumbers {

    static class Main {
        public int solution(int N) {
            int answer = 0;
            int tmp = 0;
            for (int i = 1; i < N; i++) {
                tmp = i;
                for (int j = i + 1; j < N; j++) {
                    tmp += j;
                    if (tmp == N) {
                        answer++;
                        break;
                    }
                    if (tmp > N) {
                        break;
                    }
                }
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            Main main = new Main();

            int N = Integer.parseInt(bufferedReader.readLine());
            int result = main.solution(N);

            bufferedReader.close();

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.flush();

            bufferedWriter.close();
        }
    }
}

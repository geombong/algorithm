package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PrimeNumbers {
    static class Main {
        public int solution(int number) {
            int answer = 0;

            if (number == 2) {
                answer = 1;
                return answer;
            }

            int[] numbers = new int[number + 1];

            for (int i = 2; i <= number; i++) {
                if (numbers[i] == 0) {
                    answer++;
                    for (int j = i; j <= number; j += i) {
                        numbers[j] = 1;
                    }
                }
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            Main main = new Main();

            int number = Integer.parseInt(bufferedReader.readLine());
            int result = main.solution(number);

            bufferedReader.close();

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}

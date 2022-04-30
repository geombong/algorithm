package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SelectionSort {

    static class Main {
        public int[] solution(int countOfNumber, int[] numbers) {
            int[] answer = numbers;
            for (int i = 0; i < countOfNumber - 1; i++) {
                int min = numbers[i];
                int minPosition = i;
                for (int j = i + 1; j < countOfNumber; j++) {
                    if (numbers[j] < min) {
                        min = numbers[j];
                        minPosition = j;
                    }
                }
                int minTmp = numbers[i];
                numbers[i] = min;
                numbers[minPosition] = minTmp;
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            Main main = new Main();

            int countOfNumber = Integer.parseInt(bufferedReader.readLine());
            int[] numbers = new int[countOfNumber];
            String[] tmp = bufferedReader.readLine().split(" ");

            for (int i = 0; i < tmp.length; i++) {
                numbers[i] = Integer.parseInt(tmp[i]);
            }

            int[] result = main.solution(countOfNumber, numbers);

            StringBuilder stringBuilder = new StringBuilder();
            for (var number : result) {
                stringBuilder.append(number).append(" ");
            }

            bufferedReader.close();

            bufferedWriter.write(stringBuilder.substring(0, stringBuilder.length() - 1));
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}

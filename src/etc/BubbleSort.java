package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BubbleSort {
    static class Main {
        public int[] solution(int countOfNumber, int[] numbers) {
            int[] answer = numbers;
            boolean flag;
            for (int i = 0; i < countOfNumber - 1; i++) {
                flag = true;
                int pointA = 0;
                int pointB = 1;
                for (int j = 1; j < countOfNumber - i; j++) {
                    if (answer[pointA] > answer[pointB]) {
                        int tmp = answer[pointA];
                        answer[pointA] = answer[pointB];
                        answer[pointB] = tmp;
                        flag = false;
                    }
                    pointA++;
                    pointB++;
                }
                if (flag) {
                    break;
                }
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

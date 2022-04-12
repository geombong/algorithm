package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class concatenationOfTwo {
    static class Main {
        public List<Integer> solution(int[] numbers1, int[] numbers2) {
            List<Integer> answer = new ArrayList<>();
            int pointerA = 0;
            int pointerB = 0;

            while (pointerA < numbers1.length && pointerB < numbers2.length) {
                if (numbers1[pointerA] > numbers2[pointerB]) {
                    answer.add(numbers2[pointerB++]);
                } else if (numbers1[pointerA] < numbers2[pointerB]) {
                    answer.add(numbers1[pointerA++]);
                } else {
                    answer.add(numbers1[pointerA++]);
                    answer.add(numbers2[pointerB++]);
                }
            }
            while (pointerA < numbers1.length) {
                answer.add(numbers1[pointerA++]);
            }

            while (pointerB < numbers2.length) {
                answer.add(numbers2[pointerB++]);
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

            int[] number1 = inputNumbers1(bufferedReader);
            int[] number2 = inputNumbers2(bufferedReader);

            Main main = new Main();

            List<Integer> result = main.solution(number1, number2);

            StringBuilder stringBuilder = new StringBuilder();
            for (int i : result) {
                stringBuilder.append(i).append(" ");
            }

            bufferedReader.close();

            bufferedWriter.write(stringBuilder.substring(0, stringBuilder.length() - 1));
            bufferedWriter.flush();
            bufferedWriter.close();
        }

        private static int[] inputNumbers2(BufferedReader bufferedReader) throws IOException {
            StringTokenizer stringTokenizer;
            int countB = Integer.parseInt(bufferedReader.readLine());
            int[] number2 = new int[countB];
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            for (int i = 0; i < countB; i++) {
                number2[i] = Integer.parseInt(stringTokenizer.nextToken());
            }
            return number2;
        }

        private static int[] inputNumbers1(BufferedReader bufferedReader) throws IOException {
            StringTokenizer stringTokenizer;
            int countA = Integer.parseInt(bufferedReader.readLine());
            int[] number1 = new int[countA];
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            for (int i = 0; i < countA; i++) {
                number1[i] = Integer.parseInt(stringTokenizer.nextToken());
            }
            return number1;
        }
    }
}

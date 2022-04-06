package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class RockPaperScissors {
    static class Main {
        public String[] solution(int gameCount, int[] a, int[] b) {
            String[] answer = new String[gameCount];
            for (int i = 0; i < gameCount; i++) {
                if (a[i] == b[i]) {
                    answer[i] = "D";
                } else if (a[i] == 1 && b[i] == 3) {
                    answer[i] = "A";
                } else if (a[i] == 2 && b[i] == 1) {
                    answer[i] = "A";
                } else if (a[i] == 3 && b[i] == 2) {
                    answer[i] = "A";
                } else {
                    answer[i] = "B";
                }
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            Main main = new Main();
            StringTokenizer stringTokenizer;

            int gameCount = Integer.parseInt(bufferedReader.readLine());

            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            int[] a = new int[gameCount];

            for (int i = 0; i < gameCount; i++) {
                a[i] = Integer.parseInt(stringTokenizer.nextToken());
            }

            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            int[] b = new int[gameCount];

            for (int i = 0; i < gameCount; i++) {
                b[i] = Integer.parseInt(stringTokenizer.nextToken());
            }

            String[] results = main.solution(gameCount, a, b);

            bufferedReader.close();

            for (String result : results) {
                bufferedWriter.write(result + "\n");
            }

            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}

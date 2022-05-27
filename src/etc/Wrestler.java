package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Wrestler {

    static class Main {

        public int solution(int count, int[][] table) {
            int answer = count;

            int stature;
            int weight;

            for (int i = 0; i < count; i++) {
                stature = table[i][0];
                weight = table[i][1];
                for (int j = 0; j < count; j++) {
                    if (stature < table[j][0] && weight < table[j][1]) {
                        answer--;
                        break;
                    }
                }
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

            int count = Integer.parseInt(bufferedReader.readLine());
            int[][] table = new int[count][2];
            StringTokenizer stringTokenizer;

            for (int i = 0; i < count; i++) {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
                int stature = Integer.parseInt(stringTokenizer.nextToken());
                int weight = Integer.parseInt(stringTokenizer.nextToken());

                table[i][0] = stature;
                table[i][1] = weight;
            }

            Main main = new Main();
            int result = main.solution(count, table);

            bufferedReader.close();

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}

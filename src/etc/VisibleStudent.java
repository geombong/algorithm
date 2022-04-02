package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class VisibleStudent {
    static class Main {
        public int solution(int[] heights) {
            int answer = 0;
            int maxHeight = 0;
            for (int i = 0; i < heights.length; i++) {
                if (heights[i] > maxHeight) {
                    maxHeight = heights[i];
                    answer++;
                }
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            Main main = new Main();
            StringTokenizer stringTokenizer;

            int heightCount = Integer.parseInt(bufferedReader.readLine());

            int[] heights = new int[heightCount];

            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            for (int i = 0; i < heightCount; i++) {
                heights[i] = Integer.parseInt(stringTokenizer.nextToken());
            }

            int result = main.solution(heights);

            bufferedReader.close();

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}

package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class GoRideDFS {

    static int[] weights;
    static int[] subSet;
    static int maximumWeight;
    static List<Integer> tmp;
    static int count;

    static class Main {
        public int solution(int depth) {
            int answer = 0;
            if (depth == count) {

            } else {

            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            maximumWeight = Integer.parseInt(bufferedReader.readLine());

            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            count = Integer.parseInt(stringTokenizer.nextToken());
            int depth = 0;
            weights = new int[count];
            tmp = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                weights[i] = Integer.parseInt(bufferedReader.readLine());
            }

            Main main = new Main();
            int result = main.solution(depth);

            bufferedReader.close();

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}

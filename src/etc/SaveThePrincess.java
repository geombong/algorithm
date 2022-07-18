package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class SaveThePrincess {

    static class Main {
        public int solution(int N, int K) {
            int answer = 0;
            Deque<Integer> princes = new ArrayDeque<>();
            for (int i = 1; i <= N; i++) {
                princes.add(i);
            }
            while (princes.size() != 1) {
                for (int i = 1; i < K; i++) {
                    princes.addLast(princes.pollFirst());
                }
                princes.pollFirst();
            }
            answer = princes.peek();
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            Main main = new Main();
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int N = Integer.parseInt(stringTokenizer.nextToken());
            int K = Integer.parseInt(stringTokenizer.nextToken());

            int result = main.solution(N, K);

            bufferedReader.close();

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}

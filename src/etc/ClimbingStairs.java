package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ClimbingStairs {
    static class Main {
        public int solution(int numberOfStairs) {
            int answer = 0;
            int[] numberOfWays = new int[numberOfStairs];
            numberOfWays[0] = 1;
            numberOfWays[1] = 2;

            for (int i = 2; i < numberOfStairs; i++) {
                numberOfWays[i] = numberOfWays[i - 1] + numberOfWays[i - 2];
            }

            answer = numberOfWays[numberOfStairs - 1];
            return answer;
        }


        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

            int numberOfStairs = Integer.parseInt(bufferedReader.readLine());

            Main main = new Main();

            int result = main.solution(numberOfStairs);

            bufferedReader.close();

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}

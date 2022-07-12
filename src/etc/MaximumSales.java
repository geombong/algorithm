package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class MaximumSales {
    static class Main {
        public int solution(int days, int[] salesByDate) {
            int answer = 0;
            int maximumSales = 0;
            for (int i = 0; i < days; i++) {
                maximumSales += salesByDate[i];
            }
            answer = maximumSales;
            for (int i = days; i < salesByDate.length; i++) {
                maximumSales += (salesByDate[i] - salesByDate[i - days]);
                answer = Math.max(answer, maximumSales);
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            int date = Integer.parseInt(stringTokenizer.nextToken());
            int days = Integer.parseInt(stringTokenizer.nextToken());

            int[] salesByDate = new int[date];
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            for (int i = 0; i < date; i++) {
                salesByDate[i] = Integer.parseInt(stringTokenizer.nextToken());
            }

            Main main = new Main();

            int result = main.solution(days, salesByDate);

            bufferedReader.close();

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}

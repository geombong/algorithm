package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SubsetEqualToTheSum {

    static class Main {

        static int count;
        static int[] numbers;
        static int[] subSet;
        static List<Integer> tmp = new ArrayList<>();

        public String toPointer() {
            int lp = 0;
            int rp = tmp.size() - 1;

            while (lp < rp) {
                if (tmp.get(lp) == tmp.get(rp)) {
                    return "YES";
                }
                lp++;
                rp--;
            }
            return "NO";
        }

        public void solution(int depth) {
            int sum = 0;
            if (depth == count) {
                for (int i = 0; i < subSet.length; i++) {
                    sum += subSet[i];
                }
                tmp.add(sum);
            } else {
                subSet[depth] = numbers[depth];
                solution(depth + 1);
                subSet[depth] = 0;
                solution(depth + 1);
            }
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            Main main = new Main();

            count = Integer.parseInt(bufferedReader.readLine());
            numbers = new int[count];
            subSet = new int[count];

            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            for (int i = 0; i < count; i++) {
                numbers[i] = Integer.parseInt(stringTokenizer.nextToken());
            }

            main.solution(0);
            String result = main.toPointer();

            bufferedReader.close();

            bufferedWriter.write(result);
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}

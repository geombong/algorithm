package baekjoon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bjo7568 {

    public static void main(String[] args) throws IOException {
        Bjo7568Solve solve = new Bjo7568Solve();
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;

        int count = Integer.parseInt(buf.readLine());
        int[][] value = new int[count][2];

        for (int i = 0; i < count; i++) {
            str = new StringTokenizer(buf.readLine(), " ");
            value[i][0] = Integer.parseInt(str.nextToken());
            value[i][1] = Integer.parseInt(str.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        Arrays.stream(solve.solved(value)).forEach(s -> sb.append(s).append(" "));
        System.out.println(sb.substring(0, sb.length() - 1));

        buf.close();
    }
}

class Bjo7568Solve {
    public int[] solved(int[][] value) {
        int[] result = new int[value.length];

        for (int i = 0; i < value.length; i++) {
            int ranking = 1;
            for (int j = 0; j < value.length; j++) {
                if (i == j) {
                    continue;
                }
                if (value[i][0] < value[j][0] && value[i][1] < value[j][1]) {
                    ranking++;
                }
            }
            result[i] = ranking;
        }
        return result;
    }
}

class Bjo7568Test {
    @Test
    void bjo7568Test() {
        int[] testResult = {2, 2, 1, 2, 5};
        int[][] value = {
                {55, 185},
                {58, 183},
                {88, 186},
                {60, 175},
                {46, 155}
        };
        Bjo7568Solve solve = new Bjo7568Solve();
        int[] result = solve.solved(value);

        Assertions.assertArrayEquals(testResult, result);
    }
}
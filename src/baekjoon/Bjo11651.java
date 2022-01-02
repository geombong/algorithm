package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bjo11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(buf.readLine());
        int[][] locations = new int[count][2];

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(buf.readLine(), " ");
            locations[i][0] = Integer.parseInt(st.nextToken());
            locations[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(locations, (l1, l2) -> {
            if (l1[1] == l2 [1]) {
                return l1[0] - l2[0];
            }
            return l1[1] - l2[1];
        });

        for (int i = 0; i < count; i++) {
            System.out.println(locations[i][0] + " " + locations[i][1]);
        }
    }
}
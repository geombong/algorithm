package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Bjo4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            List<Integer> value = Arrays.stream(buf.readLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            int x = value.get(0);
            int y = value.get(1);
            int z = value.get(2);

            if (x == 0 && y == 0 && z == 0) break;

            if (Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2)) {
                sb.append("right").append('\n');
            } else if (Math.pow(x, 2) == (Math.pow(y, 2) + Math.pow(z, 2))) {
                sb.append("right").append('\n');
            } else if ((Math.pow(y, 2)) == (Math.pow(z, 2) + Math.pow(x, 2))) {
                sb.append("right").append('\n');
            } else {
                sb.append("wrong").append('\n');
            }
        }
        System.out.println(sb);
    }
}
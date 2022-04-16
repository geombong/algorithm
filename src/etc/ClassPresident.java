package etc;

import static java.lang.Integer.MIN_VALUE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ClassPresident {

    static class Main {

        public char solution(String sign) {
            char answer = ' ';
            Map<Character, Integer> signs = new HashMap<>();
            Integer max = MIN_VALUE;

            for (char c : sign.toCharArray()) {
                signs.put(c, signs.getOrDefault(c, 0) + 1);
            }

            for (Entry<Character, Integer> c : signs.entrySet()) {
                if (c.getValue() > max) {
                    max = c.getValue();
                    answer = c.getKey();
                }
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            Main main = new Main();
            bufferedReader.readLine();
            String sign = bufferedReader.readLine();

            char result = main.solution(sign);

            bufferedReader.close();

            bufferedWriter.write(result);
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}

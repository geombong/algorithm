package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    static class Main {
        public String solution(String strA, String strB) {
            String answer = "YES";
            Map<Character, Integer> alphabets = new HashMap<>();

            for (char c : strA.toCharArray()) {
                alphabets.put(c, alphabets.getOrDefault(c, 0) + 1);
            }
            for (char c : strB.toCharArray()) {
                if (!alphabets.containsKey(c) || alphabets.get(c) == 0) {
                    answer = "NO";
                    return answer;
                } else {
                    alphabets.put(c, alphabets.get(c) - 1);
                }
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            Main main = new Main();

            String strA = bufferedReader.readLine();
            String strB = bufferedReader.readLine();

            String result = main.solution(strA, strB);

            bufferedReader.close();

            bufferedWriter.write(result);
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}

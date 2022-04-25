package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class CranePuppetDraw {
    static class Main {
        public int solution(String[][] map, String[] moves) {
            int answer = 0;
            Stack<String> basket = new Stack<>();

            for (String m : moves) {
                for (int i = 0; i < map.length; i++) {
                    String target = map[i][Integer.parseInt(m) - 1];
                    if (!target.equals("0")) {
                        if (basket.isEmpty()) {
                            basket.push(target);
                        } else {
                            if (basket.peek().equals(target)) {
                                basket.pop();
                                answer += 2;
                            } else {
                                basket.push(target);
                            }
                        }
                        map[i][Integer.parseInt(m) - 1] = "0";
                        break;
                    }
                }
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            Main main = new Main();

            int mapSize = Integer.parseInt(bufferedReader.readLine());
            String[][] map = new String[mapSize][mapSize];

            for (int i = 0; i < map.length; i++) {
                map[i] = bufferedReader.readLine().split(" ");
            }

            String moveCount = bufferedReader.readLine();

            String[] moves = bufferedReader.readLine().split(" ");

            int result = main.solution(map, moves);

            bufferedReader.close();

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}

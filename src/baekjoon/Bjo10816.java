package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Bjo10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> cards = new HashMap<>();

        int cardCount = Integer.parseInt(buf.readLine());
        StringTokenizer str = new StringTokenizer(buf.readLine(), " ");

        for (int i = 0; i < cardCount; i++) {
            int card = Integer.parseInt(str.nextToken());

            cards.put(card, cards.getOrDefault(card, 0) + 1);
        }

        int numberCount = Integer.parseInt(buf.readLine());
        str = new StringTokenizer(buf.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numberCount; i++) {
            int number = Integer.parseInt(str.nextToken());

            sb.append(cards.getOrDefault(number, 0)).append(" ");
        }

        System.out.println(sb.substring(0, sb.length() - 1));
    }
}
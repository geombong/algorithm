package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Bjo1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(buf.readLine());

        List<String> word = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            word.add(buf.readLine());
        }

        word.stream()
                .distinct()
                .sorted((a, b) -> {
                    if (a.length() == b.length()) {
                        return sortAlphabetically(a, b);
                    }
                    return a.length() - b.length();
                })
                .forEach(System.out::println);
    }

    private static int sortAlphabetically(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) > b.charAt(i)) {
                return 1;
            }
            if (a.charAt(i) < b.charAt(i)) {
                return -1;
            }
        }
        return 0;
    }
}
package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class TypeOfSales {
    static class Main {
        public List<Integer> solution(int days, List<Integer> sales) {
            List<Integer> answer = new LinkedList<>();
            Map<Integer, Integer> salesType = new LinkedHashMap<>();

            for (int i = 0; i < days; i++) {
                salesType.put(sales.get(i), salesType.getOrDefault(sales.get(i), 0) + 1);
            }
            answer.add(salesType.size());
            for (int i = days, j = 0; i < sales.size(); i++, j++) {
                salesType.put(sales.get(j), salesType.get(sales.get(j)) - 1);
                if (salesType.get(sales.get(j)) == 0) {
                    salesType.remove(sales.get(j));
                }
                salesType.put(sales.get(i), salesType.getOrDefault(sales.get(i), 0) + 1);
                answer.add(salesType.size());
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer stringTokenizer;
            Main main = new Main();

            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int day = Integer.parseInt(stringTokenizer.nextToken());
            int days = Integer.parseInt(stringTokenizer.nextToken());

            List<Integer> sales = new ArrayList<>();
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            for (int i = 0; i < day; i++) {
                sales.add(Integer.parseInt(stringTokenizer.nextToken()));
            }

            List<Integer> result = main.solution(days, sales);
            StringBuilder stringBuilder = new StringBuilder();

            for (int i : result) {
                stringBuilder.append(i).append(" ");
            }

            bufferedReader.close();

            bufferedWriter.write(stringBuilder.substring(0, stringBuilder.length() - 1));
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bjo1924 {
    public static void main(String[] args) throws IOException {

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(buf.readLine(), " ");
        int[] monthOfDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        List<Integer> monthAndDay = new ArrayList<>();

        while (st.hasMoreTokens()) {
            monthAndDay.add(Integer.parseInt(st.nextToken()));
        }

        int days = 0;

        for (int i = 0; i < monthAndDay.get(0); i++) {
            days += monthOfDay[i];
        }

        days -= monthOfDay[monthAndDay.get(0) - 1] - monthAndDay.get(1);
        System.out.println(week[days % week.length]);
    }
}
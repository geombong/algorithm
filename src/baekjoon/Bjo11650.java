package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bjo11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(buf.readLine());
        Location[] locations = new Location[count];

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(buf.readLine(), " ");
            int xLocation = Integer.parseInt(st.nextToken());
            int yLocation = Integer.parseInt(st.nextToken());
            locations[i] = new Location(xLocation, yLocation);
        }

        Arrays.sort(locations, (l1, l2) -> {
            if (l1.xLocation == l2.xLocation) {
                return l1.yLocation - l2.yLocation;
            }
            return l1.xLocation - l2.xLocation;
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(locations[i]);
        }
        System.out.println(sb);
    }

    static class Location {
        int xLocation;
        int yLocation;

        public Location(int xLocation, int yLocation) {
            this.xLocation = xLocation;
            this.yLocation = yLocation;
        }

        @Override
        public String toString() {
            return xLocation + " " + yLocation + "\n";
        }
    }
}
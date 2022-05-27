package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class ConferenceRoomAssignment {

    static class Main {
        public int solution(int count, List<Time> times) {
            times.sort(Comparator.comparingInt(Time::getEndTime));
            int answer = 1;
            int endTime = times.get(0).endTime;
            for (Time time : times) {
                if (time.startTime >= endTime) {
                    answer++;
                    endTime = time.endTime;
                }
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

            int count = Integer.parseInt(bufferedReader.readLine());
            StringTokenizer stringTokenizer;
            List<Time> times = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
                int startTime = Integer.parseInt(stringTokenizer.nextToken());
                int endTime = Integer.parseInt(stringTokenizer.nextToken());

                times.add(new Time(startTime, endTime));
            }

            Main main = new Main();
            int result = main.solution(count, times);

            bufferedReader.close();

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.flush();
            bufferedWriter.close();
        }

        static class Time {
            int startTime;
            int endTime;

            public Time(int startTime, int endTime) {
                this.startTime = startTime;
                this.endTime = endTime;
            }

            public int getEndTime() {
                return endTime;
            }
        }
    }
}

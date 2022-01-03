package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bjo10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        int back = -1;
        for (int i = 0; i < count; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            String type = str.nextToken();
            switch (type) {
                case "push":
                    back = Integer.parseInt(str.nextToken());
                    queue.offer(back);
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append("-1").append("\n");
                        break;
                    }
                    sb.append(queue.poll()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
                    break;
                case "back":
                    sb.append(queue.isEmpty() ? -1 : back).append("\n");
                    break;

            }
        }
        System.out.print(sb);
    }
}
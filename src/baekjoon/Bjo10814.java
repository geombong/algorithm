package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bjo10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(buf.readLine());

        Member[] members = new Member[count];

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(buf.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            members[i] = new Member(age, name);
        }

        Arrays.sort(members, Comparator.comparingInt(m -> m.age));

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(members[i]);
        }

        System.out.println(sb);
    }

    static class Member {
        int age;
        String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age + " " + name + "\n";
        }
    }
}
package baekjoon;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Bjo2164 {
    public static void main(String[] args) throws IOException {

        Bjo2164Solve solve = new Bjo2164Solve();
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int valueN = Integer.parseInt(buf.readLine());

        BufferedWriter buw = new BufferedWriter(new OutputStreamWriter(System.out));
        int reuslt = solve.solved(valueN);

        buw.write(reuslt + "\n");

        buf.close();
        buw.flush();
        buw.close();
    }
}

class Bjo2164Solve {
    public int solved(int valueN) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= valueN; i++) {
            queue.add(i);
        }

        while (queue.size() != 1) {
            queue.poll();
            queue.add(queue.poll());
        }
        return queue.peek();
    }
}

class Bjo2164Test {

    @Test
    void bjo2164Test() {
        int testValue = 6;
        int testResult = 4;
        Bjo2164Solve solve = new Bjo2164Solve();

        assertEquals(testResult, solve.solved(testValue));
    }
}
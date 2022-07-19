package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class IHateTheSameNumber {
    public int[] solution(int[] arr) {
        Deque<Integer> numbers = new ArrayDeque<>();
        List<Integer> tmp = new ArrayList<>();
        int pointer = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            numbers.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                tmp.add(numbers.pop());
                continue;
            }
            if (tmp.get(pointer) == numbers.peek()) {
                numbers.pop();
            } else {
                tmp.add(numbers.pop());
                pointer++;
            }
        }

        int[] answer = new int[tmp.size()];

        for (int i = 0; i < tmp.size(); i++) {
            answer[i] = tmp.get(i);
        }
        return answer;
    }
}

class IHateTheSameNumberTest {

    @Test
    void test() {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] result = {1, 3, 0, 1};

        IHateTheSameNumber iHateTheSameNumber = new IHateTheSameNumber();
        int[] answer = iHateTheSameNumber.solution(arr);

        Assertions.assertArrayEquals(result, answer);
    }
}

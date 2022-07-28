package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BiggestNumber {

    public String solution(int[] numbers) {
        String[] stringNumbers = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            stringNumbers[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(stringNumbers, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if (stringNumbers[0].equals("0")) return "0";

        return String.join("", stringNumbers);
    }
}

class BiggestNumberTest {

    @Test
    void test() {
        BiggestNumber biggestNumber = new BiggestNumber();

        int[] numbers = {3, 30, 34, 5, 9};
        String expected = "9534330";
        String actual = biggestNumber.solution(numbers);

        Assertions.assertEquals(expected, actual);
    }
}

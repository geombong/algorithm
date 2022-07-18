package codesquad;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class CorrectParenthesis {
    boolean solution(String s) {
        boolean answer = false;

        Stack<Character> characters = new Stack<>();

        char[] chars = s.toCharArray();

        if (chars[0] == ')' || chars[s.length() - 1] == '(') {
            return answer;
        }

        for (char c : chars) {
            if (characters.isEmpty() && c == ')') {
                return answer;
            }
            if (c == '(') {
                characters.push(c);
            } else if (c == ')') {
                characters.pop();
            }
        }
        return characters.isEmpty();
    }
}

class CorrectParenthesisTest {

    @Test
    void test() {
        CorrectParenthesis correctParenthesis = new CorrectParenthesis();
        String parenthesis = "()))))))))))))))))";
        boolean result = correctParenthesis.solution(parenthesis);

        assertTrue(result);
    }
}

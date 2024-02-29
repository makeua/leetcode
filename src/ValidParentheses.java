import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean valid = true;
        char[] chars = s.toCharArray();
        for (int i = 0; valid && i < chars.length; i++) {
            char c = chars[i];
            switch (c) {
                case '{':
                case '(':
                case '[':
                    stack.push(c);
                    continue;
            }
            if (!stack.isEmpty()) {
                valid = switch (c) {
                    case '}' -> '{' == stack.pop();
                    case ')' -> '(' == stack.pop();
                    case ']' -> '[' == stack.pop();
                    default -> throw new IllegalArgumentException();
                };
            } else {
                valid = false;
            }
        }
        return valid && stack.isEmpty();
    }
}

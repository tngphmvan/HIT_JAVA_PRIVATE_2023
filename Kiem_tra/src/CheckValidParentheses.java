
import java.util.*;

public class CheckValidParentheses {

    public static boolean checkValidParentheses(String string) {
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put('(', ')');
        pairs.put('[', ']');
        pairs.put('{', '}');

        Stack<Character> stack = new Stack<>();
        for (char c : string.toCharArray()) {
            if (pairs.containsKey(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || pairs.get(stack.pop()) != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String string = "()[]{}";
        System.out.println("Chuỗi " + string + " là:");
        if (checkValidParentheses(string)) {
            System.out.println("Hợp lệ");
            for (char c : new char[]{'(', '[', '{'}) {
                int count = 0;
                for (char ch : string.toCharArray()) {
                    if (ch == c) {
                        count++;
                    }
                    else if (ch !=c ){
                        count--;
                    }
                }
                System.out.println(c + ": " + count );
            }
        } else {
            System.out.println("Không hợp lệ");
        }
    }
}

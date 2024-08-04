import java.util.*;

class valid_paranthesis {
    public static void main(String[] args) {
        System.out.println(check("[({})]"));

    }

    static boolean check(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                st.push(x);
                continue;
            }
            if (st.isEmpty()) {
                return false;
            }
            char y = st.pop();
            if (x == ')' && y == '(' || x == '}' && y == '{' || x == ']' && y == '[') {
                continue;
            } else {
                return false;
            }
        }
        if (st.isEmpty()) {
            return true;
        }
        return false;
    }
}
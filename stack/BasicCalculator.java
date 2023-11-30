package stack;
import java.util.Stack;

public class BasicCalculators {
    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        int sign = 1;
        int result = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + Character.getNumericValue(c);
            } else if (c == '+') {
                result += sign * num;
                num = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * num;
                num = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * num;
                num = 0;
                result *= stack.pop(); // sign
                result += stack.pop(); // result outside parentheses
            }
            int r = result+sign*num;
            
        }
        return r;
    }

    public static void main(String[] args) {
        String s1 = "1 + 1";
        String s2 = " 2-1 + 2 ";
        String s3 = "(1+(4+5+2)-3)+(6+8)";

        System.out.println(calculate(s1));  // Output: 2
        System.out.println(calculate(s2));  // Output: 3
        System.out.println(calculate(s3));  // Output: 23
    }
}



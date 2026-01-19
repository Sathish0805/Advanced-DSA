package AdvancedDSA2.Day6;

import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String s = "{[()]}{";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }else{
                if (stack.isEmpty()) {
                    System.out.print(false);
                    break;
                }
                if (stack.peek() == '{' && c  == '}' ||  stack.peek() == '[' && c  == ']' || stack.peek() == '(' && c == ')') {
                    stack.pop();
                }else {
                    System.out.print(false);
                    break;
                }
            }
        }
        if (!stack.isEmpty()) {
            System.out.print(false);
        }else  {
            System.out.print(true);
        }
    }
}

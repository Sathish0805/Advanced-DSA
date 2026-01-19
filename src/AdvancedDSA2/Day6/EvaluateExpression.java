package AdvancedDSA2.Day6;

import java.util.Stack;

public class EvaluateExpression {
    public static void main(String[] args) {
        String[] str = {"4", "13", "5", "/", "+"};
        Stack<Integer> stack = new Stack<>();
        for (String s : str) {
            if (!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")) {
                stack.push(Integer.parseInt(s));
            } else {
                int op2 = stack.getLast();
                stack.pop();
                int op1 = stack.getLast();
                stack.pop();
                switch (s) {
                    case "+":
                        stack.push(op1 + op2);
                        break;
                    case "*":
                        stack.push(op1 * op2);
                        break;
                    case "/":
                        stack.push(op1 / op2);
                        break;
                    case "-":
                        stack.push(op1 - op2);
                        break;
                }
            }
        }
        System.out.println(stack);
    }
}

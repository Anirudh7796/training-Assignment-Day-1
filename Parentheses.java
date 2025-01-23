package com.wiprotrain2;

import java.util.Stack;

public class Parentheses {
    public static void main(String[] args) {
        String input = "{[()]}";  // enter the brackets
        if (isValid(input)) {
            System.out.println("The given string has valid brackets.");
        } else {
            System.out.println("The given string has invalid brackets.");
        }
    }

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);  // Push opening brackets to stack
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) {
                    return false;  // Stack is empty, no matching opening bracket
                }

                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;  // If top of stack doesn't match the current closing bracket
                }
            }
        }

        return stack.isEmpty();  // If stack is empty, all brackets are matched
    }

    public static boolean isMatchingPair(char opening, char closing) {
        return (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']') ||
               (opening == '(' && closing == ')');
    }
}

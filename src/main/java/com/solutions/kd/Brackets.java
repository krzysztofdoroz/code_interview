package com.solutions.kd;

import java.util.Stack;

/**
 * Created by e-kfdz on 9/18/2017.
 */
public class Brackets {

    public int solution(String S) {
        Stack<Character> stack = new Stack<Character>();

        for (char c : S.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.empty()) {
                        return 0;
                    } else if (stack.peek() == '(') {
                        stack.pop();
                    }
                    break;
                case '}':
                    if (stack.empty()) {
                        return 0;
                    } else if (stack.peek() == '{') {
                        stack.pop();
                    }
                    break;
                case ']':
                    if (stack.empty()) {
                        return 0;
                    } else if (stack.peek() == '[') {
                        stack.pop();
                    }
                    break;
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

}

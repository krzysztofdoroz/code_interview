package com.solutions.kd;

import java.util.Stack;

/**
 * Created by e-kfdz on 9/18/2017.
 */
public class Nesting {

    public int solution(String S) {
        Stack<Character> stack = new Stack<Character>();

        for (char c : S.toCharArray()) {
            switch (c) {
                case '(':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty()) {
                        return 0;
                    } else if (stack.peek() == '(') {
                        stack.pop();
                    }
                    break;
            }
        }

        return stack.empty() ? 1 : 0;
    }

}

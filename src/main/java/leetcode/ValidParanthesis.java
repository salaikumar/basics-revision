package leetcode;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the  input string is valid.
 *The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class ValidParanthesis {

    public boolean isValid(String s) {
        if (s.isEmpty() || s == null)
            return false;
        if (s.length() % 2 != 0)
            return false;
        Stack<Character> stack = new Stack<Character>();
        char popedChar;
        for ( char c : s.toCharArray()){
            switch (c){
                case '{':
                    stack.push(c);
                    break;
                case '(':
                    stack.push(c);
                    break;
                case '[':
                    stack.push(c);
                    break;
                case '}' :
                    if (stack.isEmpty())
                        return false;
                    popedChar = stack.pop();
                    if (popedChar != '{')
                        return false;
                    break;
                case ')':
                    if (stack.isEmpty())
                        return false;
                    popedChar = stack.pop();
                    if (popedChar != '(')
                        return false;
                    break;
                case ']':
                    if (stack.isEmpty())
                        return false;
                    popedChar = stack.pop();
                    if (popedChar != '[')
                        return false;
                    break;
            }
        }
        if (!stack.isEmpty())
            return false;
        return true;
    }
}

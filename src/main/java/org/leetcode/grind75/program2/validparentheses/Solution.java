package org.leetcode.grind75.program2.validparentheses;

import java.util.Stack;


class Solution {
    public static void main(String[] args) {
        System.out.println("Expected: false");
        System.out.println("Actual: "+new Solution().isValid("(]"));

        System.out.println("Expected: true");
        System.out.println("Actual: "+new Solution().isValid("()[]{}"));

        System.out.println("Expected: false");
        System.out.println("Actual: "+new Solution().isValid("(]"));
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c=='{')
                stack.push(c);
            else if(c == ')' && !stack.isEmpty() && stack.peek() == '(')
                stack.pop();
            else if(c == ']' && !stack.isEmpty() && stack.peek() == '[')
                stack.pop();
            else if(c == '}' && !stack.isEmpty() && stack.peek() == '{')
                stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }
}
package org.leetcode.grind75.program5.validpalindrome;

class Solution {
    public static void main(String[] args) {
        System.out.println("Expected: " + false);
        System.out.println("Actual:"+ new Solution().isPalindrome("race a car"));

        System.out.println("Expected: " + true);
        System.out.println("Actual:"+new Solution().isPalindrome("A man, a plan, a canal: Panama"));

    }
    public boolean isPalindrome(String s) {
        if(s.length() < 1) return true;
        int start = 0, end = s.length()-1;
        for(int i = start; i < end; i++){
            while(start < end && !Character.isLetterOrDigit(s.charAt(start)))
                start++;
            while(start < end && !Character.isLetterOrDigit(s.charAt(end)))
                end--;
            char st = Character.toLowerCase(s.charAt(start));
            char en = Character.toLowerCase(s.charAt(end));
            if(st != en)
                return false;
            start++;
            end--;
            if(start < end) continue;
            else break;
        }
        return true;
    }

}

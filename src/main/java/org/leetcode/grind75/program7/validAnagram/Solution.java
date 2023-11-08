package org.leetcode.grind75.program7.validAnagram;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().isAnagram("anagram", "anagram"));
        System.out.println(new Solution().isAnagram("rat", "car"));
    }
    public boolean isAnagram(String s, String t) {
        char[] values = new char[128];
        if(s.length() != t.length()) return false;
        for(char c : s.toCharArray()){
            values[c]++;
        }
        for(char c : t.toCharArray()){
            if(values[c] == 0) return false;
            else values[c]--;
        }
        return true;
    }
}
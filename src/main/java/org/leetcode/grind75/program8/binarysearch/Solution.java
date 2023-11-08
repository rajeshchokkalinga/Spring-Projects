package org.leetcode.grind75.program8.binarysearch;

class Solution {
    public static void main(String[] args) {
        System.out.println("Expected: 4");
        System.out.println("Actual: "+new Solution().search(new int[]{-1,0,3,5,9,12}, 9));
        System.out.println("Expected: -1");
        System.out.println("Actual: "+new Solution().search(new int[]{-1,0,3,5,9,12}, 2));
        System.out.println("Expected: -1");
        System.out.println("Actual: "+new Solution().search(new int[]{-1,0,3,5,9,12}, 13));
        System.out.println("Expected: 0");
        System.out.println("Actual: "+new Solution().search(new int[]{5}, 5));
        System.out.println("Expected: -1");

    }
    public int search(int[] nums, int target) {
        int left =0;
        int right = nums.length-1;
        if(target < nums[left] || target > nums[right]) return -1;
        if(nums[left] == target) return left;
        if(nums[right] == target) return right;
        while(left <= right){
            int mid = left+(right - left) /2;
            if(target == nums[mid]) return mid;
            if(target > nums[mid]) left = mid+1;
            if(target < nums[mid]) right = mid-1;
        }
        return -1;
    }


}
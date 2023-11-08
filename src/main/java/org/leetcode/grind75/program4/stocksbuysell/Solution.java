package org.leetcode.grind75.program4.stocksbuysell;

class Solution {
    public static void main(String[] args) {
        System.out.println("Expected: 5");
        System.out.println("Actual: "+new Solution().maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println("Expected: 0");
        System.out.println("Actual: "+new Solution().maxProfit(new int[]{7,6,4,3,1}));

    }
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int i=1; i<prices.length;i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else{
                maxProfit = Math.max(maxProfit, prices[i]-minPrice);
            }
        }
        return maxProfit;
    }
}
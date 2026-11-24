class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit= 0, leftPointer=0, rightPointer=1, index= prices.length, profit=0;

        while(rightPointer < index){
            if(prices[rightPointer] < prices[leftPointer]){
                leftPointer= rightPointer;
            }else{
                profit = prices[rightPointer] - prices[leftPointer];
                maxProfit = Math.max(maxProfit, profit);              

            }
             rightPointer++;
           
        }

        return maxProfit;
    }
}

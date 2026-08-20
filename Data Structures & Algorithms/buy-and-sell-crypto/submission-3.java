class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int L = 0;
        int maxProfit = 0;
        for (int R = 1; R < prices.length; R++) {
            if (prices[R] > prices[L]) {
                int currentProfit = prices[R] - prices[L];
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            } else {
                L = R;
            }
        }
        return maxProfit;
    }
}

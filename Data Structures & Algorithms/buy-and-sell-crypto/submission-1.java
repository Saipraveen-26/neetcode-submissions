class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int res = prices[j] - prices[i];
                ans = Math.max(ans, res);
            }
        }

        if (ans > 0) {
            return ans;
        } else {
            return 0;
        }
    }
}
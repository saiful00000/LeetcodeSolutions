package arrays;

public class LeetCode_121_BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int len = prices.length;
        int profit = 0;
        int buy = prices[0];

        for (int i = 1; i < len; i++) {
            int currentProfit = 0;
            if (buy >= prices[i]) {
                buy = prices[i];
            } else {
                currentProfit = prices[i] - buy;
                if (currentProfit > profit) {
                    profit = currentProfit;
                }
            }
        }

        return profit;
    }

}

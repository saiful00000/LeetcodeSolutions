package arrays;

public class LeetCode_122_BestTimeToBuyAndSellStock_II {

    public static void main(String[] args) {

        int prices[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        int len = prices.length;

        if (len == 0)
            return 0;

        int day = 0;
        int buy = prices[0];
        int sell = prices[0];

        while (day < len - 1) {
            while (day < len - 1 && prices[day] >= prices[day+1])
                day++;
            buy = prices[day];

            while (day < len - 1 && prices[day] <= prices[day+1])
                day++;
            sell = prices[day];

            maxProfit += sell - buy;
        }

        return maxProfit;
    }

}

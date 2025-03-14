import java.util.*;

/**
 * Buy and Sell Stockss: You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your proft by choosing a single a different day in the future to sell that stock. Return the
 * maximum profit you can achieve from this transaction. If you cannot achieve any proft, return 0. Example: price = [7, 1, 5, 3, 6, 4]
 */
public class ArrayBuyAndSellStocks {
    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++) {
            if(buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice; // Today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 7};
        System.out.println(buyAndSellStocks(prices));
    }
}

public class CB_Problem6_BuySellStockWithFee {
    public static void main(String[] args) {
        
    }
    public static int helper(int[] prices,int fee){
        int buy = Integer.MIN_VALUE;
        int sell = 0;

        for (int price : prices) {
            buy = Math.max(buy, sell - price);
            sell = Math.max(sell, buy + price - fee);
        }

        return sell;
    }
}

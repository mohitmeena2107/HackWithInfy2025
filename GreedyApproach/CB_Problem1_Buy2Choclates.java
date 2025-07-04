import java.util.Arrays;

public class CB_Problem1_Buy2Choclates {
    public static void main(String[] args) {
        
    }
    public static  int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        return prices[0]+prices[1]>money?money:money-prices[0]-prices[1];
    }
}

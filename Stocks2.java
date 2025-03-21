public class Stocks2 {
    
        public int maxProfit(int[] prices) {
            int profit = 0;
    
            for(int i=1;i<prices.length;i++){
                if (prices[i] > prices[i-1]){
                    profit += prices[i]-prices[i-1];
                }
            }
            return profit;
        }
        public static void main(String args[]){
            Stocks2 sol = new Stocks2();
    
            int[] prices1 = {7,1,5,3,6,4};
            System.out.println(sol.maxProfit(prices1));
    
            int[] prices2 = {1,2,3,4,5};
            System.out.println(sol.maxProfit(prices2));
        }
    
}

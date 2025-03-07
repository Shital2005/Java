public class Stocks {
   
        public int maxProfit(int[] prices) {
            int minPrice = Integer.MAX_VALUE;
            int maxProfit = 0;
    
            for(int price:prices){
                if(price<minPrice){
                    minPrice= price;
                }
            
    
            int profit= price-minPrice;
    
            if(profit>maxProfit){
                maxProfit= profit;
            }
            }
            return maxProfit;
        }
    
        public static void main(String args[]){
            Stocks sol= new Stocks();
            int [] prices= {1,5,6,8,4};
            System.out.println(sol.maxProfit(prices));
        }
    
}

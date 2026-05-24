class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int BuyingPrice=prices[0];
        int currentProfit=0;
        int SellingPrice=0;

        for(int i=0;i<n;i++){
           
                if(prices[i]<BuyingPrice){
                    BuyingPrice=prices[i];
                }
                 currentProfit=prices[i]- BuyingPrice;
                 
                if(SellingPrice <currentProfit){
                    SellingPrice =currentProfit;
                }
            }
        
          
        return  SellingPrice;
    }
}
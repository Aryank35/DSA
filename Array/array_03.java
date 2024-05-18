public class array_03 {
    public static int maxProfit(int arr[]){
        int MaxProfit = 0;
        int profit = Integer.MIN_VALUE;
        int buyPrice = arr[0];
        for(int i = 0;i<arr.length-1;i++){
            int sellPrice = arr[i+1];
            profit = sellPrice - buyPrice;
            if(profit < 0){
                buyPrice = sellPrice;
            }
            else{
                if(MaxProfit < profit){
                    MaxProfit = profit;
                }
            }
        }
        return MaxProfit;


    }
    public static void main(String[] args) {
        int nums[] = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(nums);
        System.out.println("Maximum Profit: "+ maxProfit);

    }
    
}

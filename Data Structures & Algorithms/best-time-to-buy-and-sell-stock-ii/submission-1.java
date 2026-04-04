class Solution {
    public int maxProfit(int[] profit) {
        int profitt = 0;
        for(int i=1;i<profit.length;i++){
            if(profit[i]>profit[i-1]){
                profitt+=profit[i]-profit[i-1];
            }
        }

        return profitt;
    }
}
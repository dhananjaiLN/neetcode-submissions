class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp=new int[amount+1][coins.length];
        for(int i=0;i<=amount;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans=coin(coins,amount,0,dp);
        return ans==Integer.MAX_VALUE?-1:ans;
    }
    private int coin(int[] coins,int amt,int idx,int[][] dp){
        if(amt==0)return 0;
        if(amt<0 || idx==coins.length)return Integer.MAX_VALUE;
        if(dp[amt][idx]!=-1)return dp[amt][idx];
        int take=coin(coins,amt-coins[idx],idx,dp);
        if(take!=Integer.MAX_VALUE)take+=1;
        int skip=coin(coins,amt,idx+1,dp);
        return dp[amt][idx]=Math.min(take,skip);
    }
}

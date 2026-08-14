class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length+2];
        Arrays.fill(dp,-1);
        return Math.min(minCost(cost,0,dp),minCost(cost,1,dp));
    }
    private int minCost(int[] cost,int idx,int[] dp){
        if(idx>=cost.length)return 0;
        if(dp[idx]!=-1)return dp[idx];
        int amt=0;
        amt=Math.min(minCost(cost,idx+1,dp),minCost(cost,idx+2,dp))+cost[idx];
        return dp[idx]=amt;
    }
}

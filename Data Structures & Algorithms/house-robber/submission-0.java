class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length+2];
        Arrays.fill(dp,-1);
        return maxRob(nums,0,dp);
    }
    private int maxRob(int[] nums,int idx,int[] dp){
        if(idx>=nums.length)return 0;
        if(dp[idx]!=-1)return dp[idx];
        int cost=0;
        cost=Math.max(nums[idx]+maxRob(nums,idx+2,dp),maxRob(nums,idx+1,dp));
        return dp[idx]=cost;
    }
}

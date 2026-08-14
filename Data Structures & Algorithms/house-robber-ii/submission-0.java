class Solution {
    public int rob(int[] nums) {
        int[] dp1=new int[nums.length+1];
        int[] dp2=new int[nums.length+2];
        if(nums.length==1)return nums[0];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        return Math.max(maxRob(nums,nums.length-1,0,dp1),maxRob(nums,nums.length,1,dp2));
    }
    private int maxRob(int[] nums,int limit,int idx,int[] dp){
        if(idx>=limit)return 0;
        if(dp[idx]!=-1)return dp[idx];
        int cost=0;
        cost=Math.max(nums[idx]+maxRob(nums,limit,idx+2,dp),maxRob(nums,limit,idx+1,dp));
        return dp[idx]=cost;
    }
}

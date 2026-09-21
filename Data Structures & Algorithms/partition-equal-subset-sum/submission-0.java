class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
        if(sum%2!=0)return false;
        sum/=2;
        int[][] dp=new int[sum+1][nums.length];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        int ans=part(nums,sum,0,dp);
        return ans==Integer.MAX_VALUE?false:true;

    }
    private int part(int[] nums,int sum,int idx,int[][] dp){
        if(sum==0)return 1;
        if(sum<0 || idx==nums.length)return Integer.MAX_VALUE;
        if(dp[sum][idx]!=-1)return dp[sum][idx];
        int take=part(nums,sum-nums[idx],idx+1,dp);
        int skip=part(nums,sum,idx+1,dp);
        return dp[sum][idx]=Math.min(take,skip);
    }
}

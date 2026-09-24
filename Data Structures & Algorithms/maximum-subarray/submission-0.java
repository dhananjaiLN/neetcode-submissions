class Solution {
    public int maxSubArray(int[] nums) {
        int left=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            if(sum<0){
                max=Math.max(max,sum);
                sum=0;
            }
            else max=Math.max(max,sum);
        }
        return max;

    }
}

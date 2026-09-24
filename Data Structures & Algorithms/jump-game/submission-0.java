class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int goal=n-1;
        int it=n-2;
        while(goal>0 && it>=0){
            if(nums[it]>=goal-it)goal=it;
            it--;
        }
        if(goal>0)return false;
        return true;
    }
}

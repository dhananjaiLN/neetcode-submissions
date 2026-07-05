class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Set<Integer>set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int ans=0;
        int i=0;
        while(i<nums.length){
            int val=nums[i];
            int res=0;
            if(!set.contains(val-1)){
                while(set.contains(val)){
                    res++;
                    val=val+1;
                }
                ans=Math.max(ans,res);
            }
            i++;
        }
        return ans;
    }
}

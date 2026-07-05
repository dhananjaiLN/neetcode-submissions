class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int prefix=nums[0];
        res[0]=1;
        for(int i=1;i<n;i++){
            res[i]=prefix;
            prefix*=nums[i];
        }
        int suffix=1;
        for(int i=n-2;i>=0;i--){
            suffix*=nums[i+1];
            res[i]*=suffix;
        }
        return res;
    }
}  

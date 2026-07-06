class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] maxLeft=new int[n];
        int[] maxRight=new int[n];
        int left=Integer.MIN_VALUE;
        int right=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            left=Math.max(left,height[i]);
            maxLeft[i]=left;
        }
        for(int i=n-1;i>=0;i--){
            right=Math.max(right,height[i]);
            maxRight[i]=right;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.min(maxLeft[i],maxRight[i])-height[i];
        }
        return ans;

    }
}

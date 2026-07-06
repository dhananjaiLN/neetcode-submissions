class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int ans=Integer.MIN_VALUE;
        while(left<right){
            int res=(right-left)*Math.min(heights[left],heights[right]);
            ans=Math.max(ans,res);
            if(heights[left]<heights[right])left++;
            else right--;
        }
        return ans;
    }
}

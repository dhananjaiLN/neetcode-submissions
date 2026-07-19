class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0;
        int high=matrix.length-1;
        int n=matrix[0].length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(matrix[mid][0]<=target && matrix[mid][n]>=target)return binarySearch(matrix[mid],target);
            else if(matrix[mid][0]>target)high=mid-1;
            else low=mid+1;
        }
        return false;
    }
    private boolean binarySearch(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target)return true;
            else if(arr[mid]<target)left=mid+1;
            else right=mid-1;
        }
        return false;
    }
}

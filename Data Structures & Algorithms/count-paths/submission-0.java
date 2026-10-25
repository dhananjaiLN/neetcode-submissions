class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return dfs(m-1,n-1,m,n,dp);
    }
    private int dfs(int r,int c,int m,int n,int[][] dp){
        int count=0;
        if(r<0 || c<0 ||r==m || c==n)return 0;
        if(r==0 && c==0)return 1;
        if(dp[r][c]!=-1)return dp[r][c];
        count+=dfs(r-1,c,m,n,dp)+dfs(r,c-1,m,n,dp);
        return dp[r][c]=count;
    }
}

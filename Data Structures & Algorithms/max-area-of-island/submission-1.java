class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    int cnt=dfs(grid,i,j,n,m);
                    max=Math.max(max,cnt);
                }
            }
        }
        return max;
        
    }
    private int dfs(int[][] grid,int r,int c,int n,int m){
        if(r<0 || c<0 || r==n || c==m || grid[r][c]==0)return 0;
        int[] dr={-1,0,1,0};
        int[] dc={0,-1,0,1};
        int cnt=0;
        if(grid[r][c]==1){
            cnt++;
            grid[r][c]=0;
        }
        for(int i=0;i<4;i++){
            int nr=r+dr[i];
            int nc=c+dc[i];
            if(nr>=0 && nc>=0 && nr<n && nc<m && grid[nr][nc]!=0){
                cnt+=dfs(grid,nr,nc,n,m);
            }
        }
        return cnt;
    }
}

class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    dfs(grid,i,j,n,m,0);
                }
            }
        }
        
    }
    private void dfs(int[][] grid,int r,int c,int n,int m,int dist){
        if(r<0 || c<0 ||r==n || c==m || grid[r][c]==-1)return;
        if(dist>grid[r][c])return;
        grid[r][c]=dist;
        int[] dr={-1,0,1,0};
        int[] dc={0,-1,0,1};
        for(int i=0;i<4;i++){
            int nr=r+dr[i];
            int nc=c+dc[i];
            if(nr>=0 && nc>=0 && nr<n && nc<m && grid[nr][nc]!=0 && grid[nr][nc]!=-1){
                dfs(grid,nr,nc,n,m,dist+1);
            }
        }
    }
}

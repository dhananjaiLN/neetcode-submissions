class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    cnt++;
                    dfs(grid,i,j,n,m);
                }
            }
        }
        return cnt;
    }
    private void dfs(char[][] grid,int r,int c,int n,int m){
        if(r<0 || c<0 || r>n || c>m || grid[r][c]=='0')return;
        int[] dr={-1,0,1,0};
        int[] dc={0,1,0,-1};
        grid[r][c]='0';
        for(int i=0;i<4;i++){
            int nr=r+dr[i];
            int nc=c+dc[i];
            if(nr>=0 && nc>=0 && nr<n && nc<m && grid[nr][nc]=='1'){
                dfs(grid,nr,nc,n,m);
            }
        }
    }
}

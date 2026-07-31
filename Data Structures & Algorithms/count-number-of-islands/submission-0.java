class Solution {
    public int numIslands(char[][] grid) {
        int cnt=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    cnt++;
                    dfs(grid,i,j);
                }
            }
        }
        return cnt;
    }
    private void dfs(char[][] grid,int r,int c){
        if(r<0||c<0||r==grid.length||c==grid[0].length||grid[r][c]==0)return;
        int[] dr={-1,0,1,0};
        int[] dc={0,1,0,-1};
        grid[r][c]='0';
        for(int i=0;i<4;i++){
            int nr=r+dr[i];
            int nc=c+dc[i];
            if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]!='0')dfs(grid,nr,nc);
        }
    }
}

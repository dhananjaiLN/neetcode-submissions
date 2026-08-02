class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0)q.offer(new int[]{i,j});
            }
        }
        while(!q.isEmpty()){
            int[] temp=q.poll();
            int r=temp[0];
            int c=temp[1];
            int[] dr={-1,0,1,0};
            int[] dc={0,-1,0,1};
            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr<0 || nc<0 || nr==n || nc==m || grid[nr][nc]!=Integer.MAX_VALUE)continue;
                grid[nr][nc]=grid[r][c]+1;
                q.offer(new int[]{nr,nc});
            }
        }
    }
}

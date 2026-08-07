class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int time=-1;
        int cnt=0;
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2)q.offer(new int[]{i,j});
                if(grid[i][j]==1)cnt++;
            }
        }
        if(cnt==0)return 0;
        while(!q.isEmpty()){
            int s=q.size();
            for(int k=0;k<s;k++){
                int[] temp=q.poll();
                int r=temp[0];
                int c=temp[1];
                int[] dr={-1,0,1,0};
                int[] dc={0,1,0,-1};
                for(int i=0;i<4;i++){
                    int nr=r+dr[i];
                    int nc=c+dc[i];
                    if(nr>=0 && nc>=0 && nr<n && nc<m && grid[nr][nc]!=0 && grid[nr][nc]!=2){
                        grid[nr][nc]=2;
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
            time++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1)return -1;
            }
        }
        return time;
    }
}

class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        boolean[][] pacific=new boolean[n][m];
        boolean[][] atlantic=new boolean[n][m];
        for(int i=0;i<n;i++){
            dfs(heights,i,0,pacific);
            dfs(heights,i,m-1,atlantic);
        }
        for(int j=0;j<m;j++){
            dfs(heights,0,j,pacific);
            dfs(heights,n-1,j,atlantic);
        }
        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(pacific[i][j] && atlantic[i][j])list.add(List.of(i,j));
            }
        }
        return list;
    }
    private void dfs(int[][] heights,int r,int c,boolean[][] visited){
        int n=heights.length;
        int m=heights[0].length;
        visited[r][c]=true;
        int[] dr={-1,0,1,0};
        int[] dc={0,-1,0,1};
        for(int i=0;i<4;i++){
            int nr=r+dr[i];
            int nc=c+dc[i];
            if(nr>=0 && nc>=0 && nr<n && nc<m && !visited[nr][nc] && heights[nr][nc]>=heights[r][c])dfs(heights,nr,nc,visited);
        }
    }
}

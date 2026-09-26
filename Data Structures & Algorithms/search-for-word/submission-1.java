class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(search(board,word,i,j,0))return true;
            }
        }
        return false;
    }
    private boolean search(char[][] board,String word,int r,int c,int length){
        int n=board.length;
        int m=board[0].length;
        if(board[r][c]!=word.charAt(length))return false;
        if(length==word.length()-1)return true;
        char temp=board[r][c];
        board[r][c]='#';
        int[] dr={-1,0,1,0};
        int[] dc={0,-1,0,1};
        for(int i=0;i<4;i++){
            int nr=r+dr[i];
            int nc=c+dc[i];
            if(nr>=0 && nc>=0 && nr<n && nc<m && board[nr][nc]!='#'){
                if(search(board,word,nr,nc,length+1))return true;
            }
        }
        board[r][c]=temp;
        return false;
    }
}

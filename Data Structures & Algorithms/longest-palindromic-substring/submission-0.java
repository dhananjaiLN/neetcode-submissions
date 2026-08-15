class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String rev=new StringBuilder(s).reverse().toString();
        int[][] dp=new int[n+1][n+1];
        for(int i=0;i<n;i++){
            dp[i][0]=0;
            dp[0][i]=0;
        }
        int max=0;
        int x=-1;
        for(int i=1;i<=n;i++){
            char c1=s.charAt(i-1);
            for(int j=1;j<=n;j++){
                char c2=rev.charAt(j-1);
                if(c1==c2)dp[i][j]=dp[i-1][j-1]+1;
                else dp[i][j]=0;
                int len=dp[i][j];
                int start=i-len;
                if(start==n-j && dp[i][j]>max){
                    max=dp[i][j];
                    x=i;
                }
            }
        }
        return s.substring(x-max,x);
    }
}
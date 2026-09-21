class Solution {
    public int numDecodings(String s) {
        int[] dp=new int[s.length()];
        Arrays.fill(dp,-1);
        return decode(s,0,dp);
    }
    private int decode(String s,int idx,int[] dp){
        if(idx==s.length())return 1;
        if(s.charAt(idx)=='0')return 0;
        if(dp[idx]!=-1)return dp[idx];
        int ways=0;
        ways+=decode(s,idx+1,dp);
        if(idx+1<s.length()){
            int num=Integer.parseInt(s.substring(idx,idx+2));
            if(num>=10 && num<=26)ways+=decode(s,idx+2,dp);
        }
        return dp[idx]=ways;
    }
}

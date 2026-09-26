class Solution {
    public List<String> generateParenthesis(int n) {
        StringBuilder sb=new StringBuilder();
        List<String>list=new ArrayList<>();
        paren(n,0,0,sb,list);
        return list;
    }
    private void paren(int n,int open,int close,StringBuilder sb,List<String>list){
        if(open==n && close==n){
            StringBuilder temp=new StringBuilder(sb);
            list.add(temp.toString());
            return;
        }
        if(open<n ){
            sb.append('(');
            paren(n,open+1,close,sb,list);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(')');
            paren(n,open,close+1,sb,list);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}

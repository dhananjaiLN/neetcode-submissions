class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        int len=0;
        while(i<s.length()){
            String ch=Character.toString(s.charAt(i));
            if(!sb.toString().contains(ch))sb.append(ch);
            else{
                len=Math.max(len,sb.toString().length());
                while(sb.toString().contains(ch)){
                    sb.deleteCharAt(0);
                }
                sb.append(ch);
            }
            i++;
        }
        len=Math.max(len,sb.toString().length());
        return len;
    }
}

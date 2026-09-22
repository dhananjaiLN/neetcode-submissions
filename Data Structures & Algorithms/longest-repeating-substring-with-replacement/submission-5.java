class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>map=new HashMap<>();
        int length=0;
        int left=0;
        int maxf=0;
        for(int right=0;right<s.length();right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            for(int n:map.values()){
                maxf=Math.max(n,maxf);
            }
            if(right-left+1-maxf>k){
                while(!map.isEmpty() && right-left+1-maxf>k){
                    map.put(s.charAt(left),map.get(s.charAt(left))-1);
                    left++;
                    for(int n:map.values()){
                        maxf=Math.max(n,maxf);
                    }
                }
            }
            length=Math.max(length,right-left+1);
        }
        return length;
    }
}

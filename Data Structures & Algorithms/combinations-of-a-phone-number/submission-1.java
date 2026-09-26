class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Integer,String>map=new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        StringBuilder sb=new StringBuilder();
        List<String>list=new ArrayList<>();
        if(digits.length()==0)return list;
        comb(digits,0,sb,list,map);
        return list;
    }
    private void comb(String digits,int idx,StringBuilder sb,List<String>list,HashMap<Integer,String>map){
        if(idx==digits.length()){
            list.add(new StringBuilder(sb).toString());
            return;
        }
        String str=map.get(digits.charAt(idx)-'0');
        for(char ch:str.toCharArray()){
            sb.append(ch);
            comb(digits,idx+1,sb,list,map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
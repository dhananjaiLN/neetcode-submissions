class Solution {
    public List<List<String>> partition(String s) {
        List<String>temp=new ArrayList<>();
        List<List<String>>list=new ArrayList<>();
        palindrome(s,0,temp,list);
        return list;
    }
    private void palindrome(String s,int idx,List<String>temp,List<List<String>>list){
        if(idx==s.length()){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<s.length();i++){
            String str=s.substring(idx,i+1);
            if(str.equals(new StringBuilder(str).reverse().toString())){
                temp.add(str);
                palindrome(s,i+1,temp,list);
                temp.remove(temp.size()-1);
            }
        }
    }
}

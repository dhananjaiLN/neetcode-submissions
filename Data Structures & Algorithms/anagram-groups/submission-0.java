class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>list=new ArrayList<>();
        HashMap<String,List<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            int[] arr=new int[26];
            for(char ch:str.toCharArray()){
                arr[ch-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int n:arr){
                sb.append(n+'0');
            }
            String comp=sb.toString();
            if(!map.containsKey(comp))map.put(comp,new ArrayList<>());
            map.get(comp).add(str);
        }
        for(List<String>temp:map.values()){
            list.add(temp);
        }
        return list;
    }
}

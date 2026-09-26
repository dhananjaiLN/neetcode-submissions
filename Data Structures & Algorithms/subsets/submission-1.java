class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>temp=new ArrayList<>();
        List<List<Integer>>list=new ArrayList<>();
        backtrack(nums,0,temp,list);
        return list;
    }
    private void backtrack(int[] nums,int idx,List<Integer>temp,List<List<Integer>>list){
        if(idx==nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        backtrack(nums,idx+1,temp,list);
        temp.remove(temp.size()-1);
        backtrack(nums,idx+1,temp,list);
    }
}

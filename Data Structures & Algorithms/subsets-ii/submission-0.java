class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer>temp=new ArrayList<>();
        List<List<Integer>>list=new ArrayList<>();
        Arrays.sort(nums);
        subset(nums,0,temp,list);
        return list;

    }
    private void subset(int[] nums,int idx,List<Integer>temp,List<List<Integer>>list){
        list.add(new ArrayList<>(temp));
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1])continue;
            temp.add(nums[i]);
            subset(nums,i+1,temp,list);
            temp.remove(temp.size()-1);
        }
    }
}

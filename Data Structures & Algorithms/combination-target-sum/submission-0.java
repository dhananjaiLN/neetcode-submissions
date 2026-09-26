class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer>temp=new ArrayList<>();
        List<List<Integer>>list=new ArrayList<>();
        sum(nums,target,0,temp,list);
        return list;
    }
    private void sum(int[] nums,int target,int idx,List<Integer>temp,List<List<Integer>>list){
        if(target==0){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(idx==nums.length || target<0)return;
        target-=nums[idx];
        temp.add(nums[idx]);
        sum(nums,target,idx,temp,list);
        target+=nums[idx];
        temp.remove(temp.size()-1);
        sum(nums,target,idx+1,temp,list);
    }
}

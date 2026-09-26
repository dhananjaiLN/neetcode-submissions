class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer>temp=new ArrayList<>();
        List<List<Integer>>list=new ArrayList<>();
        Arrays.sort(candidates);
        sum(candidates,target,0,temp,list);
        return list;
    }
    private void sum(int[] nums,int target,int idx,List<Integer>temp,List<List<Integer>>list){
        if(target==0){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(idx==nums.length || target<0)return;
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1])continue;
            target-=nums[i];
            temp.add(nums[i]);
            sum(nums,target,i+1,temp,list);
            target+=nums[i];
            temp.remove(temp.size()-1);
        }
    }
}

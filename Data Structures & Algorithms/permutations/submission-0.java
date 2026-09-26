class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer>temp=new ArrayList<>();
        List<List<Integer>>list=new ArrayList<>();
        per(nums,temp,list);
        return list;
    }
    private void per(int[] nums,List<Integer>temp,List<List<Integer>>list){
        if(temp.size()==nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(temp.contains(nums[i]))continue;
            temp.add(nums[i]);
            per(nums,temp,list);
            temp.remove(temp.size()-1);
        }
    }
}

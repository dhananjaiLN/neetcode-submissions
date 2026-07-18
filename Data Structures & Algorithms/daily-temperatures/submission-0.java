class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>stack=new Stack<>();
        int n=temperatures.length;
        int[] ans=new int[n];
        stack.push(0);
        for(int i=1;i<n;i++){
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                int idx=stack.pop();
                ans[idx]=i-idx;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int idx=stack.pop();
            ans[idx]=0;
        }
        return ans;
    }
}

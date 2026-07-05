class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int key:map.keySet()){
            pq.offer(new int[]{key,map.get(key)});
            if(k<pq.size())pq.poll();
        }
        List<Integer>list=new ArrayList<>();
        while(!pq.isEmpty()){
            int[] temp=pq.peek();
            list.add(temp[0]);
            pq.poll();
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;

    }
}

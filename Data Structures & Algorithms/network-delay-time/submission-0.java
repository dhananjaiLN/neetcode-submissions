class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>>adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<times.length;i++){
            int u=times[i][0];
            int v=times[i][1];
            int t=times[i][2];
            adj.get(u).add(new int[]{v,t});
        }
        int[] time=new int[n+1];
        Arrays.fill(time,Integer.MAX_VALUE);
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{k,0});
        time[0]=0;
        time[k]=0;
        while(!pq.isEmpty()){
            int[] temp=pq.poll();
            int u=temp[0];
            int t=temp[1];
            if(t>time[u])continue;
            for(int[] node: adj.get(u)){
                int v=node[0];
                int tt=node[1];
                int newTime=t+tt;
                if(newTime<time[v]){
                    time[v]=newTime;
                    pq.offer(new int[]{v,newTime});
                }
            }
        }
        int maxTime=0;
        for(int t:time){
            if(t!=0 && t==Integer.MAX_VALUE)return -1;
            maxTime=Math.max(maxTime,t);
        }
        return maxTime;
    }
}

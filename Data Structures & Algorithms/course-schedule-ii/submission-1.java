class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>>adj=new ArrayList<>();
        int[] indegree=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            adj.get(u).add(v);
            indegree[v]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0)q.offer(i);
        }
        List<Integer>topo=new ArrayList<>();
        while(!q.isEmpty()){
            int u=q.poll();
            topo.add(u);
            for(int v:adj.get(u)){
                indegree[v]--;
                if(indegree[v]==0)q.offer(v);
            }
        }
        if(topo.size()<numCourses)return new int[]{};
        int[] arr=new int[topo.size()];
        for(int i=0;i<topo.size();i++){
            arr[i]=topo.get(topo.size()-i-1);
        }
        return arr;
        
    }
}

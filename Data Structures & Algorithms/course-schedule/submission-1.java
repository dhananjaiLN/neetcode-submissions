class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
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
        return topo.size()==numCourses;
    }
}

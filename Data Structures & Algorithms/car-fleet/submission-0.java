class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        double[] time=new double[n];
        for(int i=0;i<n;i++){
            time[i]=(double)(target-position[i])/speed[i];
        }
        PriorityQueue<double[]>pq=new PriorityQueue<>((a,b)->Double.compare(b[0],a[0]));
        for(int i=0;i<n;i++){
            pq.offer(new double[]{position[i],time[i]});
        }
        int fleetCount=0;
        double fleetTime=0;
        while(!pq.isEmpty()){
            double[] temp=pq.poll();
            double t=temp[1];
            if(fleetTime<t){
                fleetCount++;
                fleetTime=t;
            }
        }
        return fleetCount;
    }
}

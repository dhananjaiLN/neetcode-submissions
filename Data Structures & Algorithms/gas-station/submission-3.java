class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int g=0;
        int c=0;
        for(int i=0;i<gas.length;i++){
            g+=gas[i];
            c+=cost[i];
        }
        if(g<c)return -1;
        int i=0;
        int idx=0;
        int tank=0;
        int shortage=0;
        while(i<gas.length){
            tank+=gas[i]-cost[i];
            if(tank<0){
                shortage+=tank;
                tank=0;
                idx=i+1;
            }
            i++;
        }
        return tank>=shortage?idx:-1;
    }
}

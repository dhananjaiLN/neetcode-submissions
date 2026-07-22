class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int n:piles){
            if(n>max)max=n;
        }
        int left=1;
        int right=max;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(koko(piles,h,mid))right=mid-1;
            else left=mid+1;
        }
        return left;
    }
    private boolean koko(int[] piles,int h,int speed){
        int time=0;
        for(int n:piles){
            time+=(n+speed-1)/speed;
        }
        return time<=h;
    }
}

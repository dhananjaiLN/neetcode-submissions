class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer>list=new ArrayList<>();
        int n=nums1.length;
        int m=nums2.length;
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                list.add(nums1[i]);
                i++;
            }
            else{
                list.add(nums2[j]);
                j++;
            }
        }
        if(i==n){
            while(j<m){
                list.add(nums2[j++]);
            }
        }
        else{
            while(i<n){
                list.add(nums1[i++]);
            }
        }
        int len=n+m;
        double median=0;
        for(int k=0;k<list.size();k++){
            System.out.print(list.get(k)+" ");
        }
        if(len%2==0){
            median=(double)(list.get(len/2)+list.get((len/2)-1))/2;
        }
        else{
            median=(double)(list.get(len/2));
        }
        return median;
    }
}

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        char[] arr=s1.toCharArray();
        Arrays.sort(arr);
        String str1=new String(arr);
        int len=str1.length();
        for(int i=0;i<=s2.length()-len;i++){
            char[] arr2=s2.substring(i,i+len).toCharArray();
            Arrays.sort(arr2);
            String str2=new String(arr2);
            if(str1.equals(str2))return true;
        }
        return false;
    }
}

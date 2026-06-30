class Solution {
    public int largestAltitude(int[] gain) {
        int [] maxalt=new int [gain.length+1];
        maxalt[0]=0;
        int sum=0;
        int ans=0;
        int a=1;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            maxalt[a]=sum;
            a++;
        }
        for(int i=0;i<gain.length+1;i++){
            ans=Math.max(ans,maxalt[i]);
        }
        return ans;
    }
}
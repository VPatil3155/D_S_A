class Solution {
    public int findMiddleIndex(int[] nums) {
        int [] sum1=new int[nums.length];
        int [] sum2=new int[nums.length];
        int left=0;
        for(int i=0;i<nums.length;i++){
            sum1[i]=left;
            left+=nums[i];
        }
        int right=0;
        for(int i=nums.length-1;i>=0;i--){
            sum2[i]=right;
            right+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(sum1[i]==sum2[i]){
                return i;
            }
        }
return -1;
    }
}
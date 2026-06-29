class Solution {
    public int pivotIndex(int[] nums) {
        int [] a=new int [nums.length];
        int [] b=new int [nums.length];
        int left=0;
        for(int i=0;i<nums.length;i++){
             a[i]=left;
            left=left+nums[i];
           
        }
        int right=0;
        for(int i=nums.length-1;i>=0;i--){
             b[i]=right;
            right=right+nums[i];
           
        }
        for(int i=0;i<nums.length;i++){
            if(a[i]==b[i]){
                return i;
            }
        }
        return -1;
    }
}
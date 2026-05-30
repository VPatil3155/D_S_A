class Solution {
    public int[] productExceptSelf(int[] nums) {
       int [] a= new int[nums.length];
       int left=1;
        for(int i=0;i<nums.length;i++){
             a[i]=left;
             left=left*nums[i];
    }
   int right=1;
        for(int i=nums.length-1;i>=0;i--){
             a[i]=a[i]*right;
             right=right*nums[i];
    }
   return a;
   }
}
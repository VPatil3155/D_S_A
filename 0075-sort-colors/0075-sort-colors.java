class Solution {
    public void sortColors(int[] nums) {
       int i=0;
       int j=0;
       int k=0;
       for(int l=0;l<nums.length;l++){
        if(nums[l]==0){
          i++;
        }else if(nums[l]==1 ){
            j++;
        }else {
           k++;
        }
       }
       for(int l=0;l<i;l++){
        nums[l]=0;
       }
       for(int l=i;l<j+i;l++){
        nums[l]=1;
       }
       for(int l=i+j;l<k+i+j;l++){
        nums[l]=2;
       }
    }
}
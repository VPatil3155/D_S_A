class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int length=0;
        int min_length=nums.length+1;
        int i=0;
        int j=1;
        int sum=nums[0];
        if(nums[i]>=target){
            return 1;
        }
        while(i<nums.length && j<nums.length){
            while(sum<target && j<nums.length){
                sum+=nums[j];
                j++;
            }
            while(sum>=target){
                length=j-i;
                if(length<min_length){
                min_length=length;
               } 
                sum-=nums[i];
                i++;
            }
        }
        if(min_length>nums.length){
            return 0;
        }
        return min_length;
    }
}
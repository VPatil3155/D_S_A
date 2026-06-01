class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            if(a==k){
                count+=1;
            }
            for(int j=i+1;j<nums.length;j++){
                a=a+nums[j];
                if(a==k){
                    count+=1;
                }
            }
        }
        return count;
    }
}
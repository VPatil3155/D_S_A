class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxSum=0;
        double sum=0;
        int j=0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        maxSum=sum;
        for(int i=k;i<nums.length;i++){
            sum += nums[i];
            sum -= nums[j];
            j++;
            if(sum>maxSum){
                maxSum = sum;
            }
        }
        return maxSum/k;
    }
}
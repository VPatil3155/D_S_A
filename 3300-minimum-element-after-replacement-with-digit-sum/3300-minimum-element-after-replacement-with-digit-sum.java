class Solution {
    public int minElement(int[] nums) {
        int [] ans = new int [nums.length];
        int minimum = 1000;
        for(int i=0; i<nums.length;i++ ){
             int sum = 0;
             int n=nums[i];
            while(n!=0){
            int digit=n%10;
            sum += digit;
            n=n/10;
            }
            ans[i]=sum;
        }
        for(int i:ans){
            if(i<minimum){
                minimum = i;
            }
        }
        return minimum;
    }
}
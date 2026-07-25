class Solution {
    public int findNumbers(int[] nums) {
       int even=0;
       for(int i=0;i<nums.length;i++){
        int temp=nums[i];
        int count=0;
        while(temp>0){
            int digit=temp%10;
            count++;
            temp/=10;
        }
        if(count%2==0){
            even+=1;
        }
       } 
       return even;
    }
}
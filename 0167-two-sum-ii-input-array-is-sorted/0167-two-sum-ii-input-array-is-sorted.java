class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] tsum=new int[2];
        int i=0;
        int j=numbers.length-1;
        while(i<j){
                if(numbers[i]+numbers[j]==target){
                    tsum[0]=i+1;
                    tsum[1]=j+1;
                }
            if(numbers[i]+numbers[j]>target){
                j--;
            }else{
                i++;
            }
              
        }
        return tsum;
    }
}
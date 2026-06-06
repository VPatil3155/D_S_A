class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] a= new int [nums.length];
        for(int i=0;i<n;i++){
            a[i*2]=nums[i];
            a[i*2+1]=nums[i+n];
        }
        return a;
    }
}
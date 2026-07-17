class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[]ans=new int[nums.length];
        Stack<Integer>stack=new Stack<>();
        for(int i=2*nums.length-1;i>=0;i--){
            int idx=i%nums.length;
            
            while( !stack.isEmpty() &&nums[stack.peek()]<=nums[idx]){
                stack.pop();
            }
            if (i < nums.length) {
              if(stack.isEmpty()){
                ans[idx] = -1;
            }else{
                ans[idx] = nums[stack.peek()];
            }
            }

            stack.push(idx);
        }
        return ans;
    }
}
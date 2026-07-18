class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int []ans=new int[nums1.length];
       Stack<Integer>stack=new Stack<>();
       HashMap<Integer,Integer>map=new HashMap<>();
      for(int i=0;i<nums2.length;i++){
       
       while(!stack.isEmpty() && stack.peek()<nums2[i]){
        int removed=stack.pop();
         map.put(removed , nums2[i]);
       }
       stack.push(nums2[i]);
      }
      while(!stack.isEmpty()){
        int removed=stack.pop();
        map.put(removed,-1);
      }
      for(int i=0;i<nums1.length;i++){
       ans[i] = map.get(nums1[i]);
      }
      return ans;
    }
}
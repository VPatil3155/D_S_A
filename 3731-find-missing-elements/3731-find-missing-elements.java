class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int max=0;
        int min=101;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }
            if(max<nums[i]){
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
    ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=min;i<max;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}

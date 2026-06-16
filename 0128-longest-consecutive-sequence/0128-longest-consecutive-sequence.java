class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int a=num;
                int seq=1;
                while(set.contains(a+1)){
                    seq+=1;
                    a+=1;
                }
                if(seq>count){
                    count=seq;
                }
            }
        }
        return count;
    }
}
class Solution {
    public int majorityElement(int[] nums) {
   HashMap<Integer,Integer>map=new HashMap<>();
for(int i=0;i<nums.length;i++){
if(map.containsKey(nums[i])){
    int a=map.get(nums[i]);
    a+=1;
    map.put(nums[i],a);
}else{
     map.put(nums[i],1);
}
}
for(int i=0;i<nums.length;i++){
    if(map.get(nums[i])>nums.length/2){
        return nums[i];
    }
}
       return -1;
    }
}
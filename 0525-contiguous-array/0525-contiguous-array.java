class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int []a=new int[nums.length];
        int []sum=new int[nums.length];
        int length=0;
        map.put(0, -1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                a[i]= -1;
            }else{
                a[i]= +1;
            }
        }
        int left=0;
        for(int i=0;i<nums.length;i++){
            left+=a[i];
            sum[i]=left;
        }
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(sum[i])){
                map.put(sum[i],i);
            }else{
            int ans = i-map.get(sum[i]);
             length= Math.max(length,ans);
            }
        }
return length;
    }
}
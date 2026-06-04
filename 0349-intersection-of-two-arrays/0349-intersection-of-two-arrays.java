class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set=new HashSet<>();
    HashSet<Integer> answer=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
           if(set.contains(nums2[i])){
            answer.add(nums2[i]);
           }
        }
        int [] a=new int[answer.size()];
        int idx=0;
       for(Integer num:answer){
        a[idx]=num;
        idx++;
       }

        return a;
    }
}
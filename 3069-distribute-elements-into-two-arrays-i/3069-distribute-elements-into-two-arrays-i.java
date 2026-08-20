class Solution {
    public int[] resultArray(int[] nums) {
       ArrayList<Integer>arr1=new ArrayList<>();
       ArrayList<Integer>arr2=new ArrayList<>();
       arr1.add(nums[0]);
       arr2.add(nums[1]);
    for(int i=2;i<nums.length;i++){
        if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)){
            arr1.add(nums[i]);
        }else{
            arr2.add(nums[i]);
        }
    }
    int m=0;
     int []result=new int[nums.length];
     for(int el:arr1){
       result[m]=el;
       m++;
    }
    for(int el:arr2){
       result[m]=el;
       m++;
    }

    return result;
    }
}
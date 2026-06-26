class Solution {
    public int totalFruit(int[] fruits) {
       HashMap<Integer,Integer>map=new HashMap<>();
       int left=0;
       int ans=0;
       for(int right=0;right<fruits.length;right++){
        if(map.containsKey(fruits[right])){
            int a=map.get(fruits[right]);
            a+=1;
            map.put(fruits[right],a);
        }else{
           map.put(fruits[right],1);  
        }
        while(map.size()>2){
            int a=map.get(fruits[left]);
            a-=1;
            map.put(fruits[left],a);
            if(a==0){
                map.remove(fruits[left]);
            }
            left++;
         }
        ans=Math.max(ans,right-left+1);
       } 
       return ans;
    }
}
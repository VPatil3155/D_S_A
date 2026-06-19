class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0;
        int ans=0;
        int max_freq=0;
        for(int right=0;right<s.length();right++){
            if(map.containsKey(s.charAt(right))){
                int a=map.get(s.charAt(right));
                a+=1;
                map.put(s.charAt(right),a);
                max_freq=Math.max(max_freq,a);
            }else{
                map.put(s.charAt(right),1);
                max_freq=Math.max(max_freq,1);
            }
            while((right-left+1)-max_freq>k){
                int a=map.get(s.charAt(left));
                a-=1;
                map.put(s.charAt(left),a);
                left++;
            }
            ans=Math.max(ans,(right-left+1));
        }
        return ans;
    }
}
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int count =0;
        boolean isOdd=false;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int a=map.get(s.charAt(i));
                a+=1;
                map.put(s.charAt(i),a);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        for(int freq:map.values()){
            if(freq%2==0){
                count+=freq;
            }else{
                count+=freq-1;
                isOdd=true;
            }
        }
        if(isOdd){
            count+=1;
        }
        return count;
    }
}
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       HashMap<Character,Integer> map =new HashMap<>();
       for(int i=0;i<ransomNote.length();i++){
        if(map.containsKey(ransomNote.charAt(i))){
            int a=map.get(ransomNote.charAt(i));
            a+=1;
            map.put(ransomNote.charAt(i),a);
        }else{
             map.put(ransomNote.charAt(i),1);
        }
       } 
       for(int i=0;i<magazine.length();i++){
        if(map.containsKey(magazine.charAt(i))){
            int a=map.get(magazine.charAt(i));
            a-=1;
            map.put(magazine.charAt(i),a);
        }
       } 
       for(int i=0;i<ransomNote.length();i++){
        if(map.get(ransomNote.charAt(i))>0){
           return false;
        }
       } 
       return true;
    }
}
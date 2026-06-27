class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       HashMap<Character,Integer>pmap=new HashMap<>(); 
       HashMap<Character,Integer>wmap=new HashMap<>();
       int left=0;
       List<Integer> ans = new ArrayList<>();
       for(int i=0;i<p.length();i++){
        if(pmap.containsKey(p.charAt(i))){
            int a=pmap.get(p.charAt(i));
            a+=1;
            pmap.put(p.charAt(i),a);
        }else{
            pmap.put(p.charAt(i),1);
        }
       }
        for(int i=0;i<s.length();i++){
            if(wmap.containsKey(s.charAt(i))){
               int a=wmap.get(s.charAt(i));
               a+=1;
               wmap.put(s.charAt(i),a);
            }else{
               wmap.put(s.charAt(i),1);
            } 
            while((i-left+1)>p.length()){
               int a=wmap.get(s.charAt(left));
               a-=1;
               wmap.put(s.charAt(left),a);
               if(a==0){
                wmap.remove(s.charAt(left));
               }
              left++;
            }
             if(pmap.equals(wmap)){
               ans.add(left);
            }
            }
        return ans;
    }
}
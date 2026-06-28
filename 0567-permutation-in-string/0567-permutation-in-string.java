class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer>wmap=new HashMap<>();
        HashMap<Character,Integer>smap=new HashMap<>();
        int left=0;
        for(int i=0;i<s1.length();i++){
            if(wmap.containsKey(s1.charAt(i))){
            int a=wmap.get(s1.charAt(i));
            a+=1;
            wmap.put(s1.charAt(i),a); 
            }else{
             wmap.put(s1.charAt(i),1);
            }
        }
        for(int i=0;i<s2.length();i++){
            if(smap.containsKey(s2.charAt(i))){
            int a=smap.get(s2.charAt(i));
            a+=1;
            smap.put(s2.charAt(i),a); 
            }else{
             smap.put(s2.charAt(i),1);
            }
            while((i-left+1)>s1.length()){
            if(smap.containsKey(s2.charAt(left))){
            int a=smap.get(s2.charAt(left));
            a-=1;
            smap.put(s2.charAt(left),a); 
            if(a==0){
                smap.remove(s2.charAt(left));
            }
            left++;
            }
           }
           if(smap.equals(wmap)){
            return true;
           }
        }
return false;
    }
}
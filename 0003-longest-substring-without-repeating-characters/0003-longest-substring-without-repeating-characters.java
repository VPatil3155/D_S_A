class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left=0;
        int right=0;
        int length=0;
        int c_length=0;
        while(left<s.length() && right<s.length()){
            if(set.contains(s.charAt(right))){
                c_length=right-left;
                if(c_length>length){
                    length=c_length;
                }
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
            }else{
                set.add(s.charAt(right));
                right++;
            }
              c_length=right-left;
                if(c_length>length){
                    length=c_length;
                }
        }
        return length;
    }
}
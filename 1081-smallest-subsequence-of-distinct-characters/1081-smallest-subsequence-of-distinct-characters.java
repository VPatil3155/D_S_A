class Solution {
    public String smallestSubsequence(String s) {
         boolean[] visited = new boolean[26];
        Stack<Character>stack=new Stack<>();
        int[]freq=new int[26];
        for (char ch : s.toCharArray()) {
          freq[ch - 'a']++;
        }
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        freq[ch - 'a']--;
        if (visited[ch - 'a']) {
          continue;
           }
        while(!stack.isEmpty() && stack.peek()>ch && freq[stack.peek()-'a']>0){
           char poppedChar = stack.pop();
            visited[poppedChar - 'a'] = false;
        }
        stack.push(ch);
        visited[ch - 'a'] = true;
      }  
      String ans="";
      for(char ch:stack){
        ans+=ch;
      }
      return ans;
    }
}
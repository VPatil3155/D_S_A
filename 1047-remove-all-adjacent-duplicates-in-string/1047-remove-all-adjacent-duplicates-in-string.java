class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty()){
            if(stack.peek()==s.charAt(i)){
                stack.pop();
                }else{
                stack.push(s.charAt(i));
            }
            }else{
                stack.push(s.charAt(i));
            }
        }
        String ans="";
        for(char part:stack){
            ans+=part;
        }
        return ans;
    }
}
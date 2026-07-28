class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            while(!stack.isEmpty() && ch<stack.peek() && k!=0 ){
                stack.pop();
                k--;
            }
            stack.push(ch);
        }
        while(k>0){
            stack.pop();
            k--;
        }
        String ans="";
        for(char dist:stack){
            ans+=dist;
        }
        int i=0;
        while(i<ans.length() && ans.charAt(i)=='0'){
            i++;
        }
        ans=ans.substring(i);
        if(ans.length()==0){
            ans="0";
        }
        return ans;
    }
}
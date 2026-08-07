class Solution {
    public String removeOuterParentheses(String s) {
        int depth=0;
     String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' && depth==0){
                depth++;
                continue;
            }else if(ch=='(' && depth>0){
                ans+=ch;
                depth++;
            }else if(ch==')'){
                 depth--;
                 if(depth>0){
                ans+=ch;
                 }              
            }
        }
        return ans;
    }
}
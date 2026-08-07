class Solution {
    public String removeOuterParentheses(String s) {
        int depth=0;
     StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' && depth==0){
                depth++;  
            }else if(ch=='(' && depth>0){
               sb.append(ch);
                depth++;
            }else if(ch==')'){
                 depth--;
                 if(depth>0){
                sb.append(ch);
                 }              
            }
        }
        return sb.toString();
    }
}
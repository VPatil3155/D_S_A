class Solution {
    public boolean isValid(String s) {
       Stack<Character>st=new Stack<>();
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            st.push(')');
        }
        else if(s.charAt(i)== '['){
            st.push(']');
        }
        else if(s.charAt(i)=='{'){
            st.push('}');
        }else if(!st.isEmpty()){
          if(s.charAt(i)==st.peek()){
            st.pop();
        }else{
            return false;
        }
        }else{
          return false;  
        }
       } 
       if(st.isEmpty()){
        return true;
       }
       return false;
      
    }
}
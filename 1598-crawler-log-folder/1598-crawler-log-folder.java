class Solution {
    public int minOperations(String[] logs) {
        Stack<String>stack=new Stack<>();
        int count=0;
        for(String st:logs){
            if(!stack.isEmpty() && st.equals("../")){
                stack.pop();
                count--;
            }else if( st.equals("./")){
                continue;
            }else if(!st.equals("./") && !st.equals("../")){
                stack.push(st);
                count++;
            }
        }
        return count;
    }
}
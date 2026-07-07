class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int firstValue=st.pop();
                int secondValue=st.pop();
                st.push(secondValue);
                st.push(firstValue);
                st.push(firstValue+secondValue); 
            }else if(operations[i].equals("D")){
                int previousValue=st.peek();
                st.push(2*previousValue);
            }else if(operations[i].equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int ans=0;
        for(int part:st){
            ans+=part;
        }
        return ans;
    }
}
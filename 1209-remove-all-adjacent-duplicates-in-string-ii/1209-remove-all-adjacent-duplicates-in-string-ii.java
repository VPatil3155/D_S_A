class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            int freq=1;
            if(!stack.isEmpty() && s.charAt(i)==stack.peek()[0]){
                freq+=stack.peek()[1];
                stack.pop();
            }
            if(freq==k){
                continue;
            }else{
                stack.push(new int[]{s.charAt(i),freq});
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int[]pair:stack){
            char ch=(char) pair[0];
            int freq=pair[1];
            for(int j=0;j<freq;j++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
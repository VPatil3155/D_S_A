class Solution {
    public String decodeString(String s) {
        Stack<Integer>stacknum=new Stack<>();
        Stack<String>stackStr=new Stack<>();
        String current = "";
        int number = 0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                if(Character.isDigit(ch)){
             number = number * 10 + (ch - '0');
            }
            }else if(ch=='['){
                stacknum.push(number);
                stackStr.push(current);
                current="";
                number=0;
            }else if(ch==']'){
               int repeat = stacknum.pop();
                String previous = stackStr.pop();
               String temp = "";
                while(repeat > 0){
                temp += current;
                repeat--;
                }
                current = previous + temp;
            }else{
                 current += ch;
            }
        }
        return current;
    }
}
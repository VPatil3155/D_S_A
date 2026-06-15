class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>set= new HashSet<>();
        while(n!=1){
            int add=0;
            if(set.contains(n)){
                return false;
            }else{
                set.add(n);
            }
            while(n>0){
                int digit=n%10;
                add+=digit*digit;
                n=n/10;
            }
            n=add;
        }
        return true;
    }
}
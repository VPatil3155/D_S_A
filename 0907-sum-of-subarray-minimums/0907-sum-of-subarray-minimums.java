class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int[] nse = new int[n];
        int[] pse = new int[n];
        Stack<Integer>stack1=new Stack<>();
        Stack<Integer>stack2=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack1.isEmpty() && arr[stack1.peek()]>=arr[i]){
                stack1.pop();
            }
            if(stack1.isEmpty()){
                pse[i]=-1;
            }else{
                  pse[i]=stack1.peek();
            }
            stack1.push(i);
            
        }
        for(int i=n-1;i>=0;i--){
            while(!stack2.isEmpty() && arr[stack2.peek()]>arr[i]){
                stack2.pop();
            }
            if(stack2.isEmpty()){
                nse[i]=n;
            }else{
                nse[i]=stack2.peek();
            }
            stack2.push(i);
        }
        int left=0;
        int right=0;
        long ans = 0;
        long MOD = 1000000007;
        for(int i=0;i<n;i++){
            left=i-pse[i];
            right=nse[i]-i;
            long contribution = (long) left * right * arr[i];
            ans = (ans + contribution) % MOD;
        }
       return (int) ans;
    }
}
class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
        int []a=new int [digits.length+1];
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]+=1;
                carry=0;
                break;
            }else if(digits[i]==9){
                carry=1;
                digits[i]=0;
            }
        }
        if(carry==1){
            a[0]=1;
            digits=a;
        }
        return digits;
    }
}
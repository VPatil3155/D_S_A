class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int j=0;
       int i=height.length-1;
      while(i>j){
            int m= Math.min(height[i],height[j])*(i-j);
            if(height[i]>height[j]){
                j++;
            }else{
                i--;
            }
               if(m > maxarea){
                maxarea=m;
               }
      }
            
        
        return maxarea;
    }
}
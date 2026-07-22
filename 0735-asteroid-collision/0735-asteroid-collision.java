class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>stack=new Stack<>();
        boolean alive=true;
        for(int i=0;i< asteroids.length;i++){
            if( asteroids[i]>0){
                stack.push(asteroids[i]);
            }else {
                alive=true;
                    while( alive && !stack.isEmpty() && stack.peek()>0 ){
                        if(stack.peek()<Math.abs(asteroids[i])){
                            stack.pop();
                        }else if(stack.peek()==Math.abs(asteroids[i])){
                            stack.pop();
                            alive=false;
                        }else{
                            alive=false;
                        }
                    }   
                if(alive){
                    stack.push(asteroids[i]);
                }
                    
                    }
        }
        int i=0;
        int []ans=new int[stack.size()];
        for(int part:stack){
            ans[i]=part;
            i++;
        }
        return ans;
    }
}
class Solution {
    public int numberOfCuts(int n) {
        if(n==1){
            return 0;
        }
      if(n%2==0){
        n=n/2;
        return n;
      } 
      else{
        return n;
      } 
    }
}
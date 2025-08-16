class Solution {
    public int smallestEvenMultiple(int n) {
    int result=0;
       if(n%2==0){
       return n;
       }
       else if (n%2!=0){ 
        result=2*n;
       }
        return result;
    }
}
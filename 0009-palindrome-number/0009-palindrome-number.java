class Solution {
    public boolean isPalindrome(int n) {
        int rem=0,rev=0,temp=n;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev){
            return(true);
        }
        else
        {
            return(false);
        }
        
    }
}
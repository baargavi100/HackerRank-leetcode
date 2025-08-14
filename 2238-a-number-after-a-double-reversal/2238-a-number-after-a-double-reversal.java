class Solution {
    public boolean isSameAfterReversals(int n) {
     int rev=0,rem,rem1,rev1=0;
     int t=n;
     while(n>0){
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
     }
     while(rev>0){
       rem1=rev%10;
       rev1=rev1*10+rem1;
       rev=rev/10;

    }
    if(rev1==t)
    {
        return true;
    }
    else{
        return false;
    }
    }
}
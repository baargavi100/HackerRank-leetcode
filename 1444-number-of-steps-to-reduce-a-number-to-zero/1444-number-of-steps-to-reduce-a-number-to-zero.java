class Solution {
    public int numberOfSteps(int n) {
    int count=0;
    while(n>0){
    if(n%2==0){
        n=n/2;
        count++;
    } 
    else if(n%2!=0){
        n=n-1;
        count++;
    }
    }
    return count; 
    }
}


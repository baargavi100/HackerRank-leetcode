class Solution {
    public int subtractProductAndSum(int n) {
    int sum=0,product=1,rem=0;
    while(n>0){
        rem=n%10;
        product=product*rem;
        sum=sum+rem;
        n=n/10;
    }
    return (product)-(sum);  
    }
}
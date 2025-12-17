class Solution {
    public int subtractProductAndSum(int n) {
       int product =1;
       int sum = 0;
       int rem = 0;
       int result ;
       while (n>0){
       rem = n % 10;
       product = product * rem ;
       sum = sum + rem ;
       n = n / 10 ;
       }
       result = (product) -  (sum);  
       return result;
    }
}
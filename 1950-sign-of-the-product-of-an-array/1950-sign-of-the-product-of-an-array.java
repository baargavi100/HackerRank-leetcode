class Solution {
    public int arraySign(int[] nums) {
     int product =1;
     for(int num:nums){
       if(num==0)
       return 0;
       if(num<0)
       product=-product;
     }
     return product;
}
}
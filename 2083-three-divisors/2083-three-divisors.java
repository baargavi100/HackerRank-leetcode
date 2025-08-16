class Solution {
    public boolean isThree(int n) { //4
int count=0;
for(int i=1;i<=n;i++) 
{
    if(n%i==0 && n/i==i) 
    {
        for(int j=1;j<i;j++) { 
            if(i%j==0){ 
                count++;
            }
        }
    }

}
return (count==1);
    }
}



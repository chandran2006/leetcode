class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,p=1;
        int m=n;
        while(m>0){
            int a=m%10;
            sum+=a;
            p*=a;
            m/=10;
        }
        int c=sum+p;
        return n%c==0;
    }
}
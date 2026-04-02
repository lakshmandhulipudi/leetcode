class Solution {
    public int[] countBits(int n) {
        // int res[] = new int[n+1]; TC is more
        // res[0] = 0;
        // for(int i=0;i<=n;i++){
        //     int x=i,c=0;
        //     while(x>0){
        //         x=x&x-1;
        //         c++;
        //     }
        //     res[i] = c;
        // }
        // return res;
        int dp[] = new int[n+1];
        for(int i =1;i <=n;i++){
            dp[i] = dp[i>>1] + (i&1);
        }
        return dp;

        
    }
}
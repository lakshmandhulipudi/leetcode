class Solution {
    public int cs(int []dp,int n) {
        if(n<=2) return dp[n]=n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]= cs(dp,n-1) + cs(dp,n-2);
    }
    public int climbStairs(int n){
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return cs(dp,n);

    }
}
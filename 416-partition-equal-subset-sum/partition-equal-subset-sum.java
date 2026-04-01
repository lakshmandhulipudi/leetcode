class Solution {
    public boolean canPartition(int[] nums) {
        int s = 0;for(int x:nums)s+=x;
        if((s&1)==1) return false;
        int t = s/2;
        boolean dp[] = new boolean[t+1];
        dp[0] = true;
        for(int x:nums){
            for(int j=t;j>=x;j--)dp[j]=dp[j]||dp[j-x];
        }
        return dp[t];
        
    }
}
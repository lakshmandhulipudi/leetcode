class Solution {
    int mc(int[] cost,int n,int []memo){
        if(memo[n]!=-1)return memo[n];
        if(n==0||n==1)return memo[n]=0;
        if(n==2)return memo[n]=Math.min(cost[0],cost[1]);
        return memo[n]=Math.min(cost[n-1]+mc(cost,n-1,memo),cost[n-2]+mc(cost,n-2,memo));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        return mc(cost,n,memo);

        
    }
}
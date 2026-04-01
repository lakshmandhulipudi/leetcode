class Solution {
    int LCS(String s1,String s2,int n,int m,int [][]memo){
        if(memo[n][m]!=-1) return memo[n][m];
        if(n==0||m==0) return memo[n][m] = 0;
        
        else if(s1.charAt(n-1)==s2.charAt(m-1))
            return memo[n][m]=1+LCS(s1,s2,n-1,m-1,memo);
        return memo[n][m] = Math.max(LCS(s1,s2,n-1,m,memo),LCS(s1,s2,n,m-1,memo));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int memo[][] = new int[n+1][m+1];
        for(int i=0;i<=n;i++)Arrays.fill(memo[i],-1);
        return LCS(text1,text2,n,m,memo);
        
    }
}
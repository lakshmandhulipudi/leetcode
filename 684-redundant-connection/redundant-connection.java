class Solution {
    void union(int []p,int r1,int r2){
        p[r1] = r2;
    }
    int find(int p[],int x){
        while(p[x]!= -1) {
            x = p[x];
        }
        return x;
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int p[] = new int[n+1];
        int res[] = new int[2];
        Arrays.fill(p,-1);
        for(int i=0;i<n;i++){
            int ru = find(p,edges[i][0]);
            int rv = find(p,edges[i][1]);
            if(ru==rv) return edges[i];
            union(p,ru,rv);
        }
        return res;
        
    }
}
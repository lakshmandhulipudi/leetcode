class Solution {
    void union(int p[],int x,int y){p[x]=y;}
    int find(int p[],int x){
        while(p[x]!=-1) x=p[x];
        return x;
    }
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int m = (n * (n-1))/2,k = 0;
        int edges[][] = new int[m][3];
        int p[] = new int[n];
        Arrays.fill(p,-1);
        for(int i = 0; i <n-1 ;i++){
            for(int j = i+1;j<n;j++){
                edges[k][0] = i;edges[k][1]=j;
                edges[k][2] = Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1]);
                k++;
            }
        }
        Arrays.sort(edges,(a,b)->a[2]-b[2]);
        int c=0,s=0,i=0;
        while(c<n-1){
            int u = edges[i][0],v=edges[i][1],w=edges[i][2];
            int ru = find(p,u),rv=find(p,v);
            if(ru!=rv){union(p,ru,rv);s+=w;c++;}
            i++;
        }
        return s;
        
    }
}
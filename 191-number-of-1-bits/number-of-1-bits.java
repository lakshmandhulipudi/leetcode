class Solution {
    public int hammingWeight(int n) {
        // int c = 0; slow process
        // while(n > 0){
        //     c += n%2;
        //     n = n/2;
        // }
        // return c;
        //fast process
        int c= 0;
        while(n >0){
            c++;
            n = n&n-1;
        }
        return c;
        
    }
}
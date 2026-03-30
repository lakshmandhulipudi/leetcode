class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int x:nums)pq.add((long)x);
        int c = 0;
        while(pq.peek()<k){
            c++;
            long x = pq.poll();long y=pq.poll();
            pq.add(2*x+y);
        }
        return c;
    }
}
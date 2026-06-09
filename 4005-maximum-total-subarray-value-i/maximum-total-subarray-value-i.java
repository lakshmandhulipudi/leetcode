class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min = Long.MAX_VALUE;
        long max =Long.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        max = Math.max(nums[i],max);
        min = Math.min(nums[i],min);
    }
    // System.out.println(max+" 0"+min);
    return k*(max-min);
        
    }
}
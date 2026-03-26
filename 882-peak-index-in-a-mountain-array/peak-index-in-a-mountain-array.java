class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            int m = (low + high)/2;
            if(arr[m] > arr[m+1]){
                high  = m;
            } else{
                low = m + 1;
            }

        }
        return low;
        
    }
}
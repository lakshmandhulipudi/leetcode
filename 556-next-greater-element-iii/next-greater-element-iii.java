class Solution {
    public int nextGreaterElement(int n) {
        char[] s = String.valueOf(n).toCharArray();
        int len = s.length;

        int i = len - 2;

        // Step 1: find first decreasing element
        while (i >= 0 && s[i] >= s[i + 1]) i--;

        if (i < 0) return -1;

        // Step 2: find just greater element than s[i]
        int mi = i + 1;
        for (int j = i + 1; j < len; j++) {
            if (s[j] > s[i] && s[j] <= s[mi]) {
                mi = j;
            }
        }

        // Step 3: swap
        char temp = s[i];
        s[i] = s[mi];
        s[mi] = temp;

        // Step 4: reverse suffix
        reverse(s, i + 1, len - 1);

        // Step 5: check overflow
        long x = Long.parseLong(new String(s));
        if (x > Integer.MAX_VALUE) return -1;

        return (int) x;
    }

    private void reverse(char[] s, int left, int right) {
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
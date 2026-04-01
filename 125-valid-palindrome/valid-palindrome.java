// class Solution {
//     public boolean isPalindrome(String s) {
//         if ( s == null) return true;

//         StringBuilder sb = new StringBuilder(s.length());
//         for(int k = 0; k < s.length(); k++) {
//             char ch = s.charAt(k);
//             if(Character.isLetterOrDigit(ch)) {
//                 sb.append(Character.toLowerCase(ch));
//             }
//         }
//         int l = 0, r = sb.length() - 1;
//         while(l < r) {
//             if (sb.charAt(1) != sb.charAt(r)) return false;
//             l++; r--;
//         }
//         return true;
//     }
// }
class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) return true;

        StringBuilder sb = new StringBuilder(s.length());
        for (int k = 0; k < s.length(); k++) {
            char ch = s.charAt(k);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }

        int l = 0, r = sb.length() - 1;
        while (l < r) {
            if (sb.charAt(l) != sb.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}

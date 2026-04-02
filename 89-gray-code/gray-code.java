class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> al = new ArrayList<>();
        al.add(0);
        for(int i=1;i<(1<<n);i++){
            al.add(i^(i>>1));
        }
        return al;
        
    }
}

// class Solution {
//     public List<Integer> grayCode(int n) {
//         List<Integer> al = new ArrayList<>();
//         al.add(0);
//         for (int i=1; i<(1<<n); i++) {
//             al.add(i^(i>>1));
//         }
//         return al;
//     }
// }
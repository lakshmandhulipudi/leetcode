import java.util.*;

class Solution {

    List<List<String>> res = new ArrayList<>();

    public void nqueen(int r, int n, boolean[] col, boolean[] tl, boolean[] tr, List<StringBuffer> b) {
        
        if (r == n) {
            List<String> t = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                t.add(new String(b.get(i)));
            }
            res.add(t);
            return;
        }

        for (int c = 0; c < n; c++) {
            if (!col[c] && !tl[r - c + n - 1] && !tr[r + c]) {

                // Place queen
                b.get(r).setCharAt(c, 'Q');
                col[c] = tl[r - c + n - 1] = tr[r + c] = true;

                nqueen(r + 1, n, col, tl, tr, b);

                // Backtrack
                b.get(r).setCharAt(c, '.');
                col[c] = tl[r - c + n - 1] = tr[r + c] = false;
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {

        boolean[] col = new boolean[n];
        boolean[] tl = new boolean[2 * n - 1];
        boolean[] tr = new boolean[2 * n - 1];

        List<StringBuffer> b = new ArrayList<>();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append('.');
        }

        for (int i = 0; i < n; i++) {
            b.add(new StringBuffer(sb));
        }

        nqueen(0, n, col, tl, tr, b);

        return res;
    }
}
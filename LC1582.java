//   Approach:
//  Iterate through each cell of the matrix. If a cell contains a 1, check its entire row 
//   and column to ensure there are no other 1s. If it is the only 1 in its row and column, 
//   increment the count of special positions.
//   Time Complexity: O(n * m * (n + m)) in the worst case, where n is the number of rows 
//  and m is the number of columns. For each cell containing a 1, we traverse its row and column.
//  Space Complexity: O(1) as we only use a constant amount of extra space for tracking.
 
class Solution {
    public int numSpecial(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    continue;
                }
                boolean good = true;
                for (int a = 0; a < n; a++) {
                    if (a != i && mat[a][j] == 1) {
                        good = false;
                        break;
                    }
                }

                for (int b = 0; b < m; b++) {
                    if (b != j && mat[i][b] == 1) {
                        good = false;
                        continue;
                    }
                }

                if (good) {
                    count++;
                }
            }
        }

        return count;
    }
}
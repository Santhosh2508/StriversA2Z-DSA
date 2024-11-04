public class Q12_RotateMatrix {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] max = {{1,2,3},{4,5,6},{7,8,9}};
        for (int[] row : max) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        sol.rotate(max);
        System.out.println("Rotated Matrix");
        for (int[] row : max) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    public void rotate(int[][] matrix) {
        int[][] ans = new int[matrix.length][matrix.length];
        int n = matrix.length -1;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                ans[j][n-i] = matrix[i][j];
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                matrix[i][j] = ans[i][j];
            }
        }

    }

}
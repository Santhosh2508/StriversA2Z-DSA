public class Q12_RotateMatrixElement {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for(int[] row : matrix){
            for(int ele : row){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        rotateMatrix(matrix);
        for(int[] row : matrix){
            for(int ele : row){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    public static void rotateMatrix(int[][] matrix){
        int row = 0;
        int col = 0;
        int maxRow = matrix.length;
        int maxCol = matrix[row].length;
        int prev;
        int cur;
        while(row < maxRow && col < maxCol){

            if(row + 1 == maxRow || col + 1 == maxCol)
                break;

            prev= matrix[row+1][col];

            for(int i = col; i < maxCol; i++){

                cur = matrix[row][i];
                matrix[row][i] = prev;
                prev = cur;
            }
            row++;

            for(int i = row; i < maxRow ;i++){
                cur = matrix[i][maxCol-1];
                matrix[i][maxCol-1] = prev;
                prev = cur;
            }
            maxCol--;

            if (row < maxRow){
                for(int i = maxCol-1; i >= col; i--){
                    cur = matrix[maxRow-1][i];
                    matrix[maxRow-1][i] = prev;
                    prev = cur;
                }
            }
            maxRow--;

            if(col < maxCol)
            {
                for(int i = maxRow-1; i >= row; i--){
                    cur = matrix[i][col];
                    matrix[i][col] = prev;
                    prev = cur;
                }
            }
            col++;
        }
    }
}

public class Q29_Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int len_of_row = matrix.length;
        int len_of_column = matrix[0].length;

        if (target < matrix[0][0] || target > matrix[len_of_row - 1][len_of_column - 1])
            return false;

        int i = 0, j = len_of_row - 1;
        while (i <= j) {
            int row = (i + j) / 2;

            if(matrix[row][0] <= target && matrix[row][len_of_column - 1] >= target){
                i = row;
                break;
            }

            if(matrix[row][0] < target) {
                i = row + 1;
            }else if(matrix[row][len_of_column - 1] > target){
                j = row - 1;
            } else {
                break;
            }
        }

        if(i > j) return false;

        int row = (i + j) / 2;

        i = 0; j = len_of_column - 1;
        while (i <= j) {
            int col = (i + j) / 2;
            if (matrix[row][col] < target) {
                i = col + 1;
            }else if(matrix[row][col] > target){
                j = col - 1;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Q29_Search2DMatrix obj = new Q29_Search2DMatrix();
        int[][] matrix = {
                {1, 2, 4, 8},
                {10, 11, 12, 13},
                {14, 20, 30, 40}
        };

        System.out.println(obj.searchMatrix(matrix, 14));
    }
}

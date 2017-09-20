28. SearchInA2DMatrix.java
//lintcode
public class Solution {
    /*
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if (matrix == null || matrix.length == 0) return false;
        if (matrix[0] == null || matrix[0].length == 0) return false;
    //row binary search
        int rowS = 0;
        int rowE = matrix.length;//notice the end is matrix.length
        int row = -1;
        int colLength = matrix[0].length;
        while (rowS + 1 < rowE) {
            int middle = rowS + (rowE - rowS)/2;
            if (matrix[middle][0] > target) {
                rowE = middle;
            }
            else if (matrix[middle][colLength - 1] < target) {
                rowS = middle;
            }
            else {
                row = middle;
                break;
            }
        }
        //System.out.println("row: " + rowE);
        if (row == -1) {
            if (matrix[rowS][0] <= target && matrix[rowS][colLength - 1] >= target) {
                row = rowS;
            }
            //boundary check for rowE
            else if (rowE < matrix.length && matrix[rowE][0] <= target && matrix[rowE][colLength - 1] >= target) {
                row = rowE;
            }
            else return false;
        }
        
        //col binary search
        int colS = 0;
        int colE = colLength;
        int col = -1;
        while (colS + 1 < colE) {
            int middle = colS + (colE - colS)/2;
            if (matrix[row][middle] == target) {
                return true;
            }
            else if (matrix[row][middle] < target) {
                colS = middle;
            }
            else {
                colE = middle;
            }
        }
        //System.out.println(row + " "+ colS + " "+colE);
        
        if (matrix[row][colS] == target) {
            return true;
        }
        else if (matrix[row][colE] == target) {
            return true;
        }
        
        return false;
    }
}
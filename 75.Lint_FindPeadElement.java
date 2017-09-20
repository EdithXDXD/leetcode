75.Lint_FindPeadElement.java
public class Solution {
    /*
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
        // write your code here
        int start = 0;
        int end = A.length;
        int middle = start + (end - start)/2;
        
        while (start + 1 < end) {
            middle = start + (end - start)/2;
            if (A[middle - 1] < A[middle] && A[middle + 1] < A[middle]) return middle;
            //uphill go right
            else if (A[middle - 1] < A[middle] && A[middle + 1] > A[middle]) {
                start = middle;
            }
            //downhill go left
            else {
                end = middle;
            }
        }
        
        if (A[start] < A[end]) return end;
        else return start;
    }
}
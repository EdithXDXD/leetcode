62.SearchInRotatedSortedArr.java
//lintcode
public class Solution {
    /*
     * @param A: an integer rotated sorted array
     * @param target: an integer to be searched
     * @return: an integer
     */
    public int search(int[] A, int target) {
        // write your code here
        if (A.length == 0) return -1;
        int start = 0;
        int end = A.length;
        int middle = start + (end - start)/2;
        //note everything should be >= target 
        while (start + 1 < end) {
            middle = start + (end - start)/2;
            if (A[middle] == target) return middle;
            if (A[0] < A[middle] && A[middle] <= target) {
                start = middle;
            }
            else if (A[0] > A[middle] && target >= A[middle]) {
                if (A[A.length - 1] >= target) {
                    //go right if the last digit is larger than target and rotated
                    start = middle;
                }
                else {
                    end = middle;
                }
            }
            else if (A[0] < A[middle] && A[middle] >= target) {
                if (target >= A[0]) {
                    //go left
                    end = middle;
                }
                else {
                    start = middle;
                }
            }
            else {
                end = middle;
            }
        }
        
        if (A[start] == target) return start;
        else if (A[end] == target) return end;
        else return -1;
        
    }
}
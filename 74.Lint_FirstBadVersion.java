74.Lint_FirstBadVersion.java
/**
 * public class SVNRepo {
 *     public static boolean isBadVersion(int k);
 * }
 * you can use SVNRepo.isBadVersion(k) to judge whether 
 * the kth code version is bad or not.
*/

public class Solution {
    /*
     * @param n: An integer
     * @return: An integer which is the first bad version.
     */
    public int findFirstBadVersion(int n) {
        // write your code here
        int start = 0; 
        int end = n;
        while (start + 1 < end) {
            int middle = start + (end - start)/2;
            if (!SVNRepo.isBadVersion(middle)) {
                //if it's good version means bad is after this
                start = middle;
            }
            else {
                end = middle;
            }
        }
        return end; //[0,1] remain two
    }
}
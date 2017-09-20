585.Lint_MaxNumInMountSequence.java
public class Solution {
    /*
     * @param nums: a mountain sequence which increase firstly and then decrease
     * @return: then mountain top
     */
    public int mountainSequence(int[] nums) {
        // write your code here
        //either up or down or the peak
        if (nums.length == 0) return -1;
        if (nums.length == 1) return nums[0];
        int start = 0;
        int end = nums.length;
        int middle = start + (end - start)/2;
        //assume there is exactly one peak in each array
        while (start + 1 < end) {
            middle = start + (end - start)/2;
            if (nums[middle - 1] < nums[middle] && nums[middle + 1] < nums[middle]) {
                return nums[middle];
            }
            //uphill
            else if (nums[middle - 1] < nums[middle] && nums[middle + 1] > nums[middle]) {
                start = middle;
            }
            else {
                end = middle;
            }
        }
        
        return nums[start];//not found at the end means it's only one direction
        // go up then go down so peak is always on the left
        
        //return -1;
    }
}
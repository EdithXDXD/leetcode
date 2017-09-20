153.FindMinInRotatedSortedArray.java
public class Solution {
    /*
     * @param nums: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] nums) {
        // write your code here
        int length = nums.length;
        int m = nums.length/2;
        int s = 0;
     
        //check if it's rotated 还能不rotated ：D
        if (nums[0] < nums[length - 1]) return nums[0];
        
        //找到第一个比前面小的数字 -》 意味有rotation
        while (m + 1 < length && nums[s] < nums[m]) {
            s = m;
            m = m + (length - s)/2; //middle
        }
        
        
        //在剩余数量中缩小范围，如果middle比s大说明变换点在右边（最小值）
        while (s + 1 < m) {
            int middle = s + (m - s)/2;
            if (nums[s] < nums[middle]) s = middle;
            else {
                m = middle;
            }
        }
        
        return Math.min(nums[s],nums[m]);
        
    }
}
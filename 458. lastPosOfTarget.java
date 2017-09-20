458. lastPosOfTarget.java
//lintcode
public class Solution {
    /*
     * @param nums: An integer array sorted in ascending order
     * @param target: An integer
     * @return: An integer
     */
     //写的什么乱七八糟的
    public int lastPosition(int[] nums, int target) {
        // write your code here
        if (nums.length == 0 ) return -1;
        if (nums.length == 1 && nums[0] != target) return -1;//这段为什么要这么测，太麻烦了真的
        if (nums.length == 2 && nums[0] != target) return -1;
        
        int middle = nums.length/2;
        int result = -1;
        if (nums[middle] == target) {
            while (middle+1 < nums.length && nums[middle + 1] == target) {
                middle ++ ;
            }
            return middle;
        }
       
       
        int[] numsHalf = new int[middle + 1];
        if (nums[middle] > target) {
            for (int i = 0; i < middle; ++ i) {
                numsHalf[i] = nums[i];
            }
            result = lastPosition(numsHalf,target);
        }
        else {
            for (int i = middle; i < nums.length; ++ i) {
                numsHalf[i - middle] = nums[i];//NOTE : numsHalf starts from 0
            }
            result = lastPosition(numsHalf,target);
            if(result == -1) return result;
            result += middle;
        }
        return result;
    }
}
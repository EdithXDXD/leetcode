238. ProdtArrWOSelf.java
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        if (size == 0) return nums;//base case 

        int[] result = new int[size];
        int productAfter = 1;
        result[0] = 1;
        for (int i = 1; i < size; ++i) {
            result[i] = result[i - 1] * nums[i - 1];//the product of all nums before 
        }
        
        for (int i = size - 1; i > -1; i--) {
            result[i] = result[i] * productAfter;
            productAfter *= nums[i];
        }
        
        // takes too much time recalculating all the product before
        // could just use result[i - 1]
//         for (int i = 0; i < nums.length; ++i) {
//             result[i] = 1;
//             for (int j = 0; j < i; ++j) {
//                 result[i] *= nums[j];//the product of all nums before 
//             }
//         }
        
//         for (int i = nums.length - 1; i > -1; i--) {
//             for (int j = nums.length - 1; j > i; j --) {
//                 result[i] *= nums[j];
//             }
//         }
        
        return result;
    }
}
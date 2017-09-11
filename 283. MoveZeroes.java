283. MoveZeroes.java
//O(n) put all none zeroes in the first ith term and just
//overwrite the value for later ones;
class Solution{
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[j] == 0) j++;
            else {
                nums[i] = nums [j]; //no zero then nums[i] = nums[i]
                i++;
                j++;
            }
        }
        //overwrite all zeroes
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}
// //bubble sort O(n2)
// class Solution {
//     public void moveZeroes(int[] nums) {
//         int temp;
//         for (int i = 0; i < nums.length; ++i) {
//             for (int j = i; j< nums.length; ++j) {
//                 if (nums[i] == 0){
//                     temp = nums[i];
//                     nums[i] = nums[j];
//                     nums[j] = temp;
//                 }
//             }
//         }
//     }
// }
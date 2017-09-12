136.SingleNum.java
class Solution {
    public int singleNumber(int[] nums) {
        //hashtable 这不是郭哥遇到的题吗
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        HashMap <Integer,Integer> map = new HashMap<Integer,Integer> ();
        for (int i = 0; i < nums.length; ++i) {
            if (!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            else {
                map.remove(nums[i]);
            }
        }
        
        for (int val: map.keySet()) {
            return val;
        }
        return 0;
    
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        //hashtable 这不是郭哥遇到的题吗
        //或者用bitwise operation x^x = 0; 0^x = x
        int result = 0;
        for (int i = 0; i < nums.length; ++i) {
            result ^= nums[i];
        }
        return result;
        
    }
}

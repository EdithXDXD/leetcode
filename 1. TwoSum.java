//TwoSum.java
public class Solution {
    /*
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // 两个for loop 搜索
        int result[] = new int[2];
        for (int i = 0; i < numbers.length; ++i){
            result[0] = i + 1;
            for (int j = i + 1; j < numbers.length; ++j){
                if (numbers[j] == target - numbers[i]){
                    result[1] = j + 1;
                    return result;
                }
            }
        }
        return result;
    }
}

public class Solution {
    /*
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1 + 1, index2 + 1] (index1 < index2)
     */
     //只需要loop一遍的方法
    public int[] twoSum(int[] numbers, int target) {
        int result[] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < numbers.length; ++i){
            if (map.get(numbers[i]) != null){
                result[0] = map.get(numbers[i]); //寻找之前储存的i的位置
                result[1] = i + 1;//第二个index一定比第一个大
                return result;
            }
            map.put(target - numbers[i],i + 1);
        }
        return result;
    }
}



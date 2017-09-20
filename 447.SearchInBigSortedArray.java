447.SearchInBigSortedArray.java
//lintcode
public class Solution {
    /*
     * @param reader: An instance of ArrayReader.
     * @param target: An integer
     * @return: An integer which is the first index of target.
     */
    public int searchBigSortedArray(ArrayReader reader, int target) {
        // write your code here
        int i = 1;
        while (true) {
            if (reader.get(i) == 2147483647||reader.get(i) > target) break;//ensure that target is in the set
            else {
                i = i*2;
            }
        }
        
        int j = i/2; //the previous one that is smaller than target 
       
        while (j + 1 < i) {//should be j+1 in case [1,3] find 2, 0+1->always checked the second one , so later shall check j
            int middle = j + (i - j)/2;//middle binary search
            //System.out.println(""+ j +" "+ i);
            if (reader.get(middle) == target) 
            {
                //required the first element
                while(middle - 1 > 0 && reader.get(middle - 1) == target) {
                    middle --;
                }
                return middle;
            }
            else if (reader.get(middle) > target || reader.get(i) == 2147483647) {
                i = middle;
                middle = j + (i - j)/2;
            }
            else {
                j = middle;
            }
        }
        
       
        if (reader.get(j) == target) {
            while (j - 1 > -1 && reader.get(j - 1) == target) {
                j --;
            }
            return j;
        }
        return -1;
        
    }
}
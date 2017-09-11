//159. LongestSubTwoDistinctChar.java
//35% Should be a better approach without using hashmap but only an array...
//TODO
class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        //map instead of set compare to the longest substring without duplicates
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int i = 0, j = 0, n = s.length(), maxLength = 0;
        while (i < n && j < n){
            char cj = s.charAt(j);
            if (!map.containsKey(cj)){
                map.put(cj,1);
            }
            else{
                map.put(cj,map.get(cj)+1);
            }
            if (map.size() > 2){
                while (map.size() > 2) {//notice u cannot simply remove the char cuz there might be duplicates
                    //instead try to remove one by one until the size of the map is smaller than 2, (<= 2 distinct nums)
                    char ci = s.charAt(i);
                    if (map.get(ci) <= 1) {
                        map.remove(ci);
                    }
                    else{
                        map.put(ci, map.get(ci) - 1);
                    }
                    i ++;
                }
            }
            j++;//guarenteed (htspell) map.size() would be smaller than 2
            maxLength = Math.max(maxLength, j - i);
            
        }
        return maxLength;
    }
}
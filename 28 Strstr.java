28 Strstr.java
class Solution {
    public int strStr(String haystack, String needle) {
        int nLength = needle.length();
        int hayLength = haystack.length();
        //check base case
        if (nLength == hayLength) { 
            if (haystack.equals(needle)) {
                return 0;
            }
        }
        if (hayLength < nLength) return -1;
        
        for (int i = 0; i < hayLength - nLength + 1; ++i) {
            if (haystack.substring(i, i+nLength).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
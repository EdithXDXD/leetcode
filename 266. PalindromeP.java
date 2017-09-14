266. PalindromeP.java
class Solution {
    public boolean canPermutePalindrome(String s) {
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < s.length(); ++i) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
            }
            else {
                set.add(s.charAt(i));
            }
        }
        if (set.size() < 2) return true;//could be only one letter in the middle so size could be = 1
        return false;
    }
}
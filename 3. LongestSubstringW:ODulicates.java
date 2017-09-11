longestSubstringW/ODulicates.java
public class Solution {
    /*
     * @param s: a string
     * @return: an integer
     */
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0, i = 0, j = 0;
        HashSet<Character> set = new HashSet<Character>();
        
        // loop through only once
        while (j < s.length() && i < s.length()){
            // if there's duplicate update max length and move i
            if(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i ++;
            }
            //if not try slide to the right
            else{
                set.add(s.charAt(j));
                j++; //window slide
                System.out.println("i: "+i+" j:"+j);
                maxLength = Math.max(maxLength,j - i);// = j-i+1 只有在slide即没有出现重复的时候才需要update length，重复了之后则是移除
            }
        }
        return maxLength;
    }
}


// answer online (slide window)
// public class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int n = s.length();
//         Set<Character> set = new HashSet<>();
//         int ans = 0, i = 0, j = 0;
//         while (i < n && j < n) {
//             // try to extend the range [i, j]
//             if (!set.contains(s.charAt(j))){
//                 set.add(s.charAt(j));
//                 j++;
//                 ans = Math.max(ans, j - i);
//             }
//             else {
//                 set.remove(s.charAt(i));
//                 i++;
//             }
//         }
//         return ans;
//     }
// }
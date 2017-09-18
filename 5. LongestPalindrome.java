5. LongestPalindrome.java
//TODO REVIEW
class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        int start = 0, end = 0, maxLength = 0;
        if (length == 0) return "";
        
        boolean palindrome[][] = new boolean[length][length];
        //dynamic programming store truth value in table
        //palindrome[i][j] true -> substring (i,j) is palindrome, vice versa
        for (int i = 0; i < length; ++i) {
            palindrome[i][i] = true; //single chars are all palindrome
        }
        //two chars
        for (int i = 0; i < length - 1; ++i) {
            if (s.charAt(i) == (s.charAt(i+1))){
                palindrome[i][i + 1] = true;
                start = i;//don't forget to update here
                end = i + 1;
                maxLength = 2;
            }
            else {
                palindrome[i][i + 1] = false;
            }
        }
        //loop through different length of substring
        //i is length of substring
        for (int i = 3; i <= length; ++i) {
            //start index
            for (int j = 0; j < length - i + 1; ++j) {
                if (palindrome[j + 1][j + i - 2] && s.charAt(j) == s.charAt(j + i - 1)){
                    palindrome[j][j + i - 1] = true;
                    if (maxLength < i) {
                       
                        start = j;
                        end = j + i - 1;
                        maxLength = i;
                        //System.out.println(start+" "+end);
                    }
                }
                else {
                    palindrome[j][j + i - 1] = false;
                }
            }
        }
        
        return s.substring(start,end + 1);
    }
}
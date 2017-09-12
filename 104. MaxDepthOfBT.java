104. MaxDepthOfBT.java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0; //when it reaches the note after leaf node
        //will return 0
        int leftLength = maxDepth(root.left);
        int rightLength = maxDepth(root.right);
        
        int depth = Math.max(leftLength, rightLength);
        return depth + 1;//for leaf node it'll be 0 + 1
        
    }
}
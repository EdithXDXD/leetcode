110. BalancedBT.java
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
    public boolean isBalanced(TreeNode root) {
        int x = height(root);
        System.out.println (x); 
        if (x == -1) return false;
        return true;
        
    }
     public int height(TreeNode root){
        if (root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        //determine whether the tree is balanced
         //left or right = -1 then return -1
        if (Math.abs(left - right) > 1 || left == -1 || right == -1) {
            System.out.println(left+" "+right);
            return -1;
        }
        root.val = Math.max(left, right) + 1;
        return root.val;
    }
    
    //don't need to find all height, jsut need to record the different
    // public int height(TreeNode root, boolean t){
    //     if (root == null) return 0;
    //     int left = height(root.left,t);
    //     int right = height(root.right,t);
    //     root.val = Math.max (left, right) + 1;
    //     return root.val;
    // }
    
    
}
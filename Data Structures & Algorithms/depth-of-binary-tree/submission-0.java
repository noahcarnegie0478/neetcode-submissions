/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxDepth(TreeNode root) {
        int max = maxCount(0, root);
        return max;
        
        
    }

    // create a recursive function to return maximum number has been count; 
    public int maxCount(int currentCount, TreeNode root) {
        if (root == null) return currentCount;

        int left = maxCount(currentCount, root.left);
        int right = maxCount(currentCount, root.right);

        left = left + 1;
        right = right + 1;

        return Math.max(left, right);


    }
}

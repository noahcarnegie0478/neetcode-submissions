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

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int[] max = new int[1];
        deepestWay(root, max);
        return max[0];

      
    }
    private int deepestWay(TreeNode root, int[] max) {
        // change max, return deepest
        if (root == null) return 0;
        int left = deepestWay(root.left, max);
        int right = deepestWay(root.right, max);
        // change max
        max[0] = Math.max(max[0], left + right);
        System.out.println("max of: " + root.val + " is " + max[0]);
        return Math.max(left, right) + 1;
    }

    
}
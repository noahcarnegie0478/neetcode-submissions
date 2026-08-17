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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        ArrayList<TreeNode> treeQueue = new ArrayList<>();
        treeQueue.add(root);
        for (int i = 0; i < treeQueue.size(); i++) {
            TreeNode hold = treeQueue.get(i).right;
            treeQueue.get(i).right = treeQueue.get(i).left ;
            treeQueue.get(i).left = hold;
            if (treeQueue.get(i).left != null) treeQueue.add(treeQueue.get(i).left );
            if (treeQueue.get(i).right != null) treeQueue.add(treeQueue.get(i).right);
        }
        return treeQueue.get(0);   
    }
}

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
        //rules: left always bigger than right
        // TreeNode dummy = new TreeNode(0);
        // TreeNode.left = root;
        // int index = 0;
        ArrayList<TreeNode> treeQueue = new ArrayList<>();
        treeQueue.add(root);

        // make a loop to get through every node of tree 

        for (int i = 0; i < treeQueue.size(); i++) {
            int left = treeQueue.get(i).left != null ? treeQueue.get(i).left.val : -101 ;
            int right = treeQueue.get(i).right != null ? treeQueue.get(i).right.val : -101;
            if (right > left) {
                TreeNode hold = treeQueue.get(i).right;
                treeQueue.get(i).right = treeQueue.get(i).left ;
                treeQueue.get(i).left = hold;
               
            }
            if (treeQueue.get(i).left != null) treeQueue.add(treeQueue.get(i).left );
            if (treeQueue.get(i).right != null) treeQueue.add(treeQueue.get(i).right);
        }

        return treeQueue.get(0);



        
    }
}

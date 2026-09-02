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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<TreeNode> queue = new ArrayList<>();
        if (root == null) return new ArrayList<>();
        List<List<Integer>>  result = new ArrayList<>();
       
        queue.add(root);

        for (int i = 0; i < queue.size(); i++) {
            TreeNode left = queue.get(i).left;
            TreeNode right = queue.get(i).right;
            // System.out.println("Root is : " + queue.get(i).val);
            // System.out.println("left is : " + (queue.get(i).left != null ? queue.get(i).left.val : 0));
            // System.out.println("right is : " + (queue.get(i).right != null ? queue.get(i).right.val : 0));
            if (left != null) queue.add(left);
            if(right != null) queue.add(right);
            }
            
        for (int i = 0; i < queue.size(); i++) {
            // find index 
            double index = Math.sqrt(i);
            int intIndex = (int) Math.round(index);
            if (result.size() < intIndex + 1) {
                //create List
                List<Integer> level = new ArrayList<>();
                level.add(queue.get(i).val);
                result.add(level);
            }else {
                //add into List
                result.get(intIndex).add(queue.get(i).val);
            }
        }

    return  result;
    }
}

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
        if (root == null) return new ArrayList<>();
        List<List<Integer>>  result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        //queue add into an Array
        queue.add(root);


        //check if queue not empty then keep processing 
        while (!queue.isEmpty()) {
            // create a new list
            ArrayList<Integer> newList = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if (node != null) {
                    newList.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
            if (newList.size() > 0) {
                result.add(newList);
            }
            // loop throught the queue at the time
            // add child into the queue

        }
        return result;
       
    }
}

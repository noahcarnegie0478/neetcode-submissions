// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */

// class Solution {
//     public TreeNode buildTree(int[] preorder, int[] inorder) {
//         // so the exercise is giving u 2 list of node, and.your mission is re build it

//         // ưe should create a recursive function
//         //where we define the root in the pre order tree and the position of it in the in-order tree 
//         // and then we break down the range of it to define where is the left and where is the right 
//         // continously it will return the final root. 

//         //step 1 find the root 
//         // step 2 find the leftside
//         // step 3 find the right side 
//         // step 4 return

//         if (preorder.length == 0 || inorder.length == 0) return null;

//         TreeNode root = new TreeNode(preorder[0]);

//         int indexOfRoot = -1;
//         for (int i = 0; i < inorder.length; i++) {
//             if (inorder[i] == root.val) {
//                 indexOfRoot = i;
//                 break;
//             }
//         }

//         int[] leftPreorder = Arrays.copyOfRange(preorder, 1, indexOfRoot+1);
//         int[] leftInorder = Arrays.copyOfRange(inorder, 0, indexOfRoot);
//         root.left = buildTree(leftPreorder, leftInorder);
//         int[] rightPreorder = Arrays.copyOfRange(preorder, indexOfRoot+1, preorder.length);
//         int[] rightInorder = Arrays.copyOfRange(inorder, indexOfRoot +1, inorder.length);
        
//         root.right = buildTree(rightPreorder, rightInorder);
//         return root;



        
//     }
// }

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
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode head = new TreeNode(0);
        TreeNode curr = head;
        int i = 0, j = 0, n = preorder.length;

        while (i < n && j < n) {
            curr.right = new TreeNode(preorder[i], null, curr.right);
            curr = curr.right;
            i++;
            while (i < n && curr.val != inorder[j]) {
                curr.left = new TreeNode(preorder[i], null, curr);
                curr = curr.left;
                i++;
            }
            j++;
            while (curr.right != null && j < n && curr.right.val == inorder[j]) {
                TreeNode prev = curr.right;
                curr.right = null;
                curr = prev;
                j++;
            }
        }
        return head.right;
    }
}

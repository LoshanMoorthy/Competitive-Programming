import javax.swing.tree.TreeNode;

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
public class RootEqualsSumOfChildren {
    public boolean checkTree(TreeNode root) {

        int left = root.getChildAt(2).getChildCount();
        int right = root.getChildAt(3).getChildCount();
        int parent = root.getParent().getChildCount();

        int sum = (int) left + right;

        if (parent == sum)
            return true;

        return false;
    }
}
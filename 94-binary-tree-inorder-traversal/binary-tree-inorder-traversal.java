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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> group=new ArrayList<>();
        inorder(root,group);
        return group;

    }
    public void inorder(TreeNode node,List<Integer> group)
    {
        if(node==null) return;
        inorder(node.left,group);
        group.add(node.val);
        inorder(node.right,group);

    }
}
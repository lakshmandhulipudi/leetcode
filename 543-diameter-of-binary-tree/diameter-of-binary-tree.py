# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def helper(self,root,maxi):
        if root==None:
            return 0
        left=self.helper(root.left,maxi)
        right=self.helper(root.right,maxi)
        maxi[0]=max(maxi[0],left+right)
        return 1+max(left,right)
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        maxi=[float('-inf')]
        self.helper(root,maxi)
        return maxi[0]
       

        
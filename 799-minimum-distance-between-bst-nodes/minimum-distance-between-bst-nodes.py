# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorder(self,root,res):
            if root==None:
                return
            self.inorder(root.left,res)
            res.append(root.val)
            self.inorder(root.right,res)
        
    def minDiffInBST(self, root: Optional[TreeNode]) -> int:
        res=[]
        self.inorder(root,res)
        mini = float('inf')
        for i in range(1,len(res)):
            diff = res[i] - res[i-1]
            if diff < mini:
                mini = diff
        return mini
        
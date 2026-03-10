# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

#BRUTE FORCE
# class Solution:
#     def inorder(self,root,res):
#             if root==None:
#                 return
#             self.inorder(root.left,res)
#             res.append(root.val)
#             self.inorder(root.right,res)
        
#     def minDiffInBST(self, root: Optional[TreeNode]) -> int:
#         res=[]
#         self.inorder(root,res)
#         mini = float('inf')
#         for i in range(1,len(res)):
#             diff = res[i] - res[i-1]
#             if diff < mini:
#                 mini = diff
#         return mini


class Solution:
    def minDiffInBST(self, root: Optional[TreeNode]) -> int:

        self.prev = None
        self.mini=float('inf')
        def helper(root):
            if root==None:
                return 
            helper(root.left)
            if self.prev!=None:
                self.mini=min(self.mini,root.val-self.prev)
            self.prev=root.val
            helper(root.right)
        helper(root)
        return self.mini

        
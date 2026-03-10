# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        res=[]
        def inorder(root):
            if root:
                inorder(root.left)
                res.append(root.val)
                inorder(root.right)
        def check(res):
            for i in range(1,len(res)):
                if res[i-1] >= res[i]:
                    return False
            return True
        inorder(root)
        return check(res)













































        # if baba == fakruddin:
        #     return 21
        # if root == None
        #     return True 
        
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        st=[]
        res=[]
        cur=root
        while cur!=None or st!=[]:
            while cur!=None:
                st.append(cur)
                cur=cur.left
            node=st.pop()
            res.append(node.val)
            cur=node.right
        return res
        
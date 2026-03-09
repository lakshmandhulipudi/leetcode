# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def verticalTraversal(self, root: Optional[TreeNode]) -> List[List[int]]:
        d = deque([[root,0,0]])
        d1 = {}
        while d:
            node,row,col = d.popleft()
            if col not in d1:
                d1[col] = []
            d1[col].append([row,node.val])

            if node.left:
                d.append([node.left,row+1,col-1])
            if node.right:
                d.append([node.right,row+1,col+1])
        print(d1)
        print(sorted(d1))
        res=[]
        for key in sorted(d1):
            level=[]
            for i in sorted(d1[key],key=lambda x:(x[0],x[1])):
                level.append(i[1])
            res.append(level)
        return res


        
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        srow=0
        erow=len(matrix)-1
        scol=0
        ecol=len(matrix[0])-1
        res=[]
        while srow<=erow and scol<=ecol:
            if srow <= erow:
                for i in range(scol,ecol+1):
                    res.append(matrix[srow][i])
            srow+=1
            if scol<=ecol:
                for i in range(srow,erow+1):
                    res.append(matrix[i][ecol])
            ecol-=1
            if srow<=erow:
                for i in range(ecol,scol-1,-1):
                    res.append(matrix[erow][i])
            erow-=1
            if scol<=ecol:
                for i in range(erow,srow-1,-1):
                    res.append(matrix[i][scol])
            scol+=1
        return res
        
class Solution:
    def sumSubarrayMins(self, arr: List[int]) -> int:
        nse=[len(arr)]*len(arr)
        st=[]
        for i in range(len(arr)-1,-1,-1):
            while st and arr[st[-1]]>=arr[i]:
                st.pop()
            if st:
                nse[i]=st[-1]
            st.append(i)
        pse = [-1]*len(arr)
        st=[]
        st = []
        for i in range(len(arr)):
            while st and arr[st[-1]]>arr[i]:
                st.pop()
            if st:
                pse[i] = st[-1]
            st.append(i)
        s=0
        for i in range(len(arr)):
            mini = (i-pse[i])*(nse[i]-i)
            cont = arr[i]*mini
            s+=cont
        return s%(10**9+7)
    

        
class Solution:
    def isValid(self, s: str) -> bool:

        st =[]
        d1 = { "}":"{","]":"[",")":"("}
        for i in s:
            if i in "([{":
                st.append(i)
            else: #)]}
                if st==[] or st[-1]!=d1[i]:
                    return False
                st.pop()
        if st==[]:return True
        else: return False


        #S(n) = O(n)
        #T(n) = O(n)
class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        result = []
        def backtrack(per):
            if(len(nums) == len(per)):
                result.append(per[:])
                return 
            for i in nums:
                if i in per:
                    continue
                per.append(i)
                backtrack(per)
                per.pop()
        backtrack([])
        return result
                
        
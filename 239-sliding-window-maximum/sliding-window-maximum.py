class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        res=[]
        d=deque()
        for i in range(len(nums)):
            if d and i-d[0]>k-1:
                d.popleft()
            while d and nums[d[-1]]<nums[i]:
                d.pop()
            d.append(i)
            if i>=k-1:
                res.append(nums[d[0]])
        return res
            


        
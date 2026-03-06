class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        d=deque(students)
        i=0
        c=0
        while d!=deque():
            if d[0]==sandwiches[i]:
                d.popleft()
                i+=1
                c=0
            else:
                x=d.popleft()
                d.append(x)
                c+=1
            if c==len(d):
                break
        return len(d)

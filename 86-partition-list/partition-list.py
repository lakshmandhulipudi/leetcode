# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def partition(self, head: Optional[ListNode], x: int) -> Optional[ListNode]:
        d1 = ListNode()
        d2 = ListNode()
        t1 = d1
        t2 = d2
        while head!=None:
            if head.val < x:
                t1.next = head
                head = head.next
                t1 = t1.next
            else:
                t2.next = head
                head = head.next
                t2  = t2.next
        t1.next = d2.next
        t2.next = None
        return d1.next
        
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int):
        start = head
        length = 0
        while start.next is not None:
            length += 1
            start = start.next
        length += 1
        if length == 1:
            pos = 0
        else:
            pos = length - n
        
        count = 0
        startagain = head
        if pos == 0 and length == 0:
            head.val = ''
        elif pos == 0:
            head = head.next
        else:
            while startagain.next is not None:
                count += 1
                if count == pos:
                    startagain.next = startagain.next.next
                    break
                else:
                    startagain = startagain.next
        '''new = []
        st = head
        while st.next is not None:
            new.append(st.val)
            st = st.next'''
        return head
    
        
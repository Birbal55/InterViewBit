/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode getIntersectionNode(ListNode a, ListNode b) {
		// if (a == null || b == null) 
		// 	return null;

        // ListNode tempA = a, tempB = b;
        // while (tempA != tempB) {
        //     tempA = (tempA == null) ? b : tempA.next;
        //     tempB = (tempB == null) ? a : tempB.next;
        // }

        // return tempA;
		
		if(a == null || b == null)
            return null;
        ListNode longer = size(a) > size(b) ? a : b;
        ListNode shorter = size(b) < size(a) ? b : a;
        longer = getKthNode(longer, (Math.abs(size(a) - size(b))));
        while(shorter != longer)
        {
            shorter = shorter.next;
            longer = longer.next;
        }
        return longer;
    }
    public int size(ListNode x)
    {
        int s = 0;
        while(x != null)
        {
            x = x.next;
            s++;
        }
        return s;
    }
    public ListNode getKthNode(ListNode longer, int diff)
    {
        ListNode cur = longer;
        while(diff > 0 && cur != null)
        {
            cur = cur.next;
            diff--;
        }
        return cur;
	}
}

21. MergeTwoSortedList.java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//和之前那个array list一样，只是这一次的话需要另一个pointer
//一直更新之后的内容，保证result一直指向开头，最后再return从第二个开始的
//node 即可 space complexity可能有点
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode l3 = result;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                l3.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            else {
                l3.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        if (l1 == null) {
            while (l2 != null) {
                l3.next = new ListNode(l2.val);
                l2 = l2.next;
                l3 = l3.next;
            }
        }
        if (l2 == null) {
            while (l1 != null) {
                l3.next = new ListNode(l1.val);
                l1 = l1.next;
                l3 = l3.next;
            }
        }
        //remove first node
        result = result.next;
  
        return result;
    }
}
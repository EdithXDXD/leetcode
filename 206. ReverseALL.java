206. ReverseALL.java
/ * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode prev = null;
        ListNode temp = null;
        /*这块儿有点搞 例：1 -> 2 -> 3 -> 4 -> 5
         在到达尾部之前，我们要拿到head之后的element之后再转向，不然head.next就是prev了
         所以3步 1. 存next 2. 转向prev 3. 把curr存为prev 4. 把head移动到下一个node
         真希望我脑子再聪明点
        */
     
        while (head.next != null) {
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
    
        //最后一步不需要拿到之后的node，所以直接转向即可
        if (head.next == null) head.next = prev;
        //或者直接head !=null return prev，只要保证head.next不是null.next即可
        
       //return prev;
    }
}
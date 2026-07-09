/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // Store the elements in Array
        List<Integer> nodes = new ArrayList<>();
        for (ListNode lst : lists) {
            // extra while loop because we needed to access each element
            while (lst != null) {
                nodes.add(lst.val);
                lst = lst.next;
            }
        }
        // Sort the Array
        Collections.sort(nodes);
        // Store the sorted Array elements in the linked list
        ListNode res = new ListNode(0);
        ListNode cur = res;
        for (int node : nodes) {
            cur.next = new ListNode(node);
            cur = cur.next;
        }
        return res.next;
    }
}

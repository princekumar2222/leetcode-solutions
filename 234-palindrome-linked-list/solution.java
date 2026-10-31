// 4 ms | 93.8 MB
class Solution {

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // Find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode rev = reverse(slow);

        // Compare both halves
        ListNode first = head;

        while (rev != null) {
            if (first.val != rev.val) {
                return false;
            }

            first = first.next;
            rev = rev.next;
        }

        return true;
    }
}
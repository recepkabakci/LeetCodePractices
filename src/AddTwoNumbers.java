

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(0);
        ListNode pointer = list;
        int range = 0;
        while (l1 != null || l2 != null || range == 1) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += range;
            range = sum / 10;
            ListNode node = new ListNode(sum % 10);
            pointer.next = node;
            pointer = pointer.next;
        }
        return list.next;
    }
}

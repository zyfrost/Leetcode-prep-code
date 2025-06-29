ListNode insertEnd(ListNode head, int val , ListNode tail) {
    ListNode newNode = new ListNode(val);
    if (head == null) return newNode;

    // while (curr.next != null) curr = curr.next;
    // curr.next = newNode;
    // ListNode curr = head;
    tail.next = newNode;
    return head;
}
    %10 
    /10
    1234567
    7654321 full
    5674321 till k
    5671234 from k to n
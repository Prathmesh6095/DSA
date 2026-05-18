//Remove Duplicates from Sorted List 

class Remove_dup_array {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cv = head;
        while(cv != null && cv.next != null){
            if(cv.val==cv.next.val){
                cv.next = cv.next.next;
            } else{
                cv = cv.next;
            }
        }
        return head;
    }
}
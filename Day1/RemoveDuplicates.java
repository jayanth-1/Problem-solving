
// Question link
/* https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list/problem */

// Complete the removeDuplicates function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
         if(head==null)
             return null;
        SinglyLinkedListNode curr,after;
        curr = head;
        after = head.next;
        while(after!=null){
            if(curr.data == after.data){
                after = after.next;
                curr.next = after;
            }
            else{
                curr = curr.next;
                after = after.next;
            }
        }
         return head;
    }
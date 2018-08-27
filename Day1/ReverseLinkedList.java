//Question link
/* https://www.hackerrank.com/challenges/reverse-a-linked-list/problem */

// Complete the reverse function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
 
        SinglyLinkedListNode prev=null,current=head,after;
        
        while(current!=null){
            after = current.next;
            current.next = prev;
            prev = current;
            current = after;
        }
        
         return prev;

    }
//Question link

/* https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem */


// Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
     
        int i=0;
        SinglyLinkedListNode prev=null,p,q;
        p = head;
        if(position!=0)
        {
        while(i!=position){
            i++;
            prev = p;
            p = p.next;
        }
            prev.next = p.next;
        }
        else{
            p = head.next;
            head.next = null;
            return p;
        }
        
        return head;
    }

//Question link

/*https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem*/

// Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
    if (head1==null) 
        return head2;
    else if (head2==null) 
        return head1;
       
    SinglyLinkedListNode smaller,new_head;
        
    if(head1.data<head2.data)
    {
        new_head=head1;
        smaller=head1;
        head1=head1.next;
    }
    
    else
    {
        new_head=head2;
        smaller=head2;
        head2=head2.next;
    }
  while((head1!=null)&&(head2!=null))
    {
        if(head1.data < head2.data)
        {    
            smaller.next=head1;
            smaller=head1;
            head1=head1.next;
        }
        else
        {    
            smaller.next=head2;
            smaller=head2;
            head2=head2.next;
        }
        
    }
    
    if(head1!=null)
        smaller.next=head1;
    else
        smaller.next=head2;
    
    return new_head;

    }

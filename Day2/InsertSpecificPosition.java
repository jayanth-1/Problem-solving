
//Question link

/*https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem*/

static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        
        SinglyLinkedListNode prev=null,p,q;
        p = head;
        int i = 0;
        q = new SinglyLinkedListNode(data);
        if(position!=0){
            while(i!=position){
                i++;
                prev = p;
                p = p.next;
            }
            
            prev.next = q;
            q.next = p;
            
        }
        
        else{
            q.next = head;
            return q;
        }
  return head;
    }
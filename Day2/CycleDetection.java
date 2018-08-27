
//Question link

/*https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem*/



static boolean hasCycle(SinglyLinkedListNode head) {
       
        HashSet<SinglyLinkedListNode> Visit = new HashSet<SinglyLinkedListNode>();
        
        while(head!=null){
            
            if(Visit.contains(head))
                return true;
            
            Visit.add(head);
            head = head.next;
        }
        
        return false;
        
    }
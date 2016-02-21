package LinkedLists;

import LinkedLists.ListNode;

public class RemoveDuplicates {
	public ListNode deleteDuplicates(ListNode head) {

		 if(head == null)
		 {
			 return null;
		 }
		 ListNode origHead = head;
		 while(head.next != null)
		 {
			 	 if(head.val == head.next.val)
				 {
					 head.next = head.next.next;
				 }
				 else
				 {
					 head = head.next;
				 }
			 
			
			 //head = head.next;
		 }
		 return origHead;
	    }
}

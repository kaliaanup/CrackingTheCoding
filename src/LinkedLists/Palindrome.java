package LinkedLists;

import LinkedLists.ListNode;

public class Palindrome {
	public boolean isPalindrome(ListNode head) {
    	if(head == null || head.next == null)
    	{
    		return true;
    	}
    	ListNode temp=head;
    	int size=0;
    	while(temp!=null)
    	{
    		temp=temp.next;
    		size++;
    	}
    	int mid = size/2;
    	
    	/*if(size%2 == 0)
    	{
    		mid=mid-1;;
    	}*/
    	
    	ListNode rHead=null;
        temp = head;
        int i=0;
        while(temp!=null)
        {
        	if(i<mid)
        	{
        		rHead=temp;
        	}
        	temp=temp.next;
        	i++;
        }
        
        
        rHead = reverseList(rHead);
        
        while(head!=null && rHead!=null)
        {
        	if(head.val != rHead.val)
        	{
        		return false;
        	}
        	head = head.next;
        	rHead = rHead.next;
        	
        }
    return true;
}
	public  ListNode reverseList(ListNode head) {
	    ListNode prev = null;
	 	ListNode temp = null;
	 	if(head == null)
	 	{
	 	    return null;
	 	}
	 	while(head.next!=null)
    	{
    		temp = head;
    		head = head.next;
    		temp.next = prev;
    		prev=temp;
        }
	 	head.next = prev;
	 	return head;
    	
    }
}

package LinkedLists;

public class DeleteANode {
	public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
	
	public void deleteNodeinMiddle(ListNode node) {
		
	}
}

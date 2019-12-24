
public class ListNode {

	
	public Entry<?, ?> entry;
	public ListNode next;
	
	ListNode(Entry e,ListNode next){
		this.entry=e;
		this.next=next;
	}

	public Entry<?, ?> getEntry() {
		return entry;
	}

	public void setEntry(Entry<?, ?> entry) {
		this.entry = entry;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}
	
}

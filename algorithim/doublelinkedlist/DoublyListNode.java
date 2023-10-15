package mandatoryHomeWork.week16;

public class DoublyListNode {
	 DoublyListNode next, previous;
	    int val;

//	    Optional constructor, as the below constructor will solve the problem for adding int he first node
//	    DoublyListNode(int value) {
//	        this.val = value;
//	    }

	    DoublyListNode(int value, DoublyListNode previous,DoublyListNode next) {
	        this.val = value;
	        this.previous = previous;
	        this.next = next;
	    }
}

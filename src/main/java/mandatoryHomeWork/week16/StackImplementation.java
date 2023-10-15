package mandatoryHomeWork.week16;

public class StackImplementation {
	   DoublyLinkedList list = null;

	    StackImplementation(){
	        new DoublyLinkedList();
	    }

	    //addFirst
	    public void push(int val){
	        list.addFirst(val);
	    }

	    //removeFirst
	    public void pop(int val){
	        list.removeFirst();
	    }

	    public int peek(){
	        return list.peek();
	    }
}

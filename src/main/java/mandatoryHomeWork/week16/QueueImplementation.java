package mandatoryHomeWork.week16;

public class QueueImplementation {
	 DoublyLinkedList list;
	    QueueImplementation(){
	        list = new DoublyLinkedList();
	    }

	    //adding to the queue -> addLast
	    public void enqueue(int val){
	        list.addLast(val);
	    }

	    //removing from the queue -> removeFirst
	    public void dequeue(){

	        list.removeFirst();
	    }

}

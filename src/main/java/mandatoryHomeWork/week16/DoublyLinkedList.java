package mandatoryHomeWork.week16;

public class DoublyLinkedList {


    private DoublyListNode head , tail;
    private int size = 0 ;

    public int peek(){
        return head.val;
    }

    public DoublyListNode add(int val){
        if(head == null)
            head = tail = new DoublyListNode(val, null, null);
        else {
            tail.next = new DoublyListNode(val, tail, null);
            tail = tail.next;
        }
        size++;
        return tail;
    }

    public DoublyListNode addLast(int val){
        return add(val);
    }

    public DoublyListNode addFirst(int val){
        if(head == null)
            head = tail = new DoublyListNode(val, null,null);
        else {
            head.previous = new DoublyListNode(val, null, head);
            head = head.previous;
        }
        size++;

        return head;
    }

    public void removeFirst(){
        if(head != null){
            if(head.next == null)
                head = null;
            else{
                head = head.next;
                head.previous = null;
            }
            size--;
        }
    }

    public void removeLast(){
        if(tail != null){
            if(tail.previous == null)
                tail = null;
            else{
                tail = tail.previous;
                tail.next = null;
            }
            size--;
        }
    }
}

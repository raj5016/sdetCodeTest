package mandatoryHomeWork.week15;

import java.util.LinkedList;

import mandatoryHomeWork.week15.LeetCode_206_ReverseLinkedList.ListNode;

public class SingleLinkedListImplementations {
	
	public class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public Node head;
	public Node tail;
	private int size;
	
	//=======================================Adding the nodes=====================================
	public  void addNode(int data) {
		if(head==null) {  //if head is null, then it is first and last element so assigning head and tail
			tail=head=new Node(data);
		}else {
			tail.next=new Node(data);
			tail=tail.next;
		}
		size++;
	}
	
	//=========================================Display============================================
	public void displayNodes() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	//================================Getting size withOut loop======================================
	public int getSize() {
		return size;
	}
	
	//=================================another way of getting size with loop==========================
	public int getSizeWithLoop() {
		int size=0;
		Node current=head;
		while(current!=null) {
			size++;
			current=current.next;
		}
		return size;
	}
	
	//=================================Remove the node=================================================
	public void removeNode(int dataToRemove) {
	    if (head == null) {
	        return; // List is empty, nothing to remove.
	    }

	    // Check if the head node contains the data to be removed.
	    if (head.data == dataToRemove) {
	        head = head.next;
	        size--;
	        return;
	    }

	    // Initialize pointers for traversal.
	    Node previous = null;
	    Node current = head;

	    // Traverse the list to find the node with the data to remove.
	    while (current != null && current.data != dataToRemove) {
	        previous = current;
	        current = current.next;
	    }

	    // If the data is found, update the next reference of the previous node.
	    if (current != null) {
	        previous.next = current.next;
	        size--; // Decrement the size when a node is removed.
	    }
	}
	//=============================AddALL==============================================================
	public void addALL(SingleLinkedListImplementations otherList) {
		if(otherList!=null && otherList.head==null) {
			return; // Nothing to add if the other list is empty.
		}
		
		if(head==null) {
			head=otherList.head;
			tail=otherList.tail;
		}else {
			tail.next=otherList.head;
			tail=tail.next;
		}
		 // Update the size of the current list.
		size+=otherList.size;
		
		// Clear the other list after adding its elements.
        otherList.head = null;
        otherList.tail = null;
        otherList.size = 0;
	}
//=================================Add ALl at specfic index==============================================
	public void addAll(int index, SingleLinkedListImplementations otherList) {
	    if (otherList == null || otherList.head == null || index < 0 || index > size) {
	        return; // Invalid input or nothing to add.
	    }

	    if (index == 0) {
	        // If the index is 0, prepend the other list to the current list.
	        otherList.tail.next = head;
	        head = otherList.head;
	    } else {
	        Node current = head;
	        for (int i = 1; i < index; i++) {
	            current = current.next;
	        }
	        
	        otherList.tail.next = current.next;
	        current.next = otherList.head;
	    }

	    // Update the size of the current list.
	    size += otherList.size;

	    // Clear the other list after adding its elements.
	    otherList.head = null;
	    otherList.tail = null;
	    otherList.size = 0;
	}
	
	//==================================Insert value====================================================
	public void insert(int index, int value) {
	    if (index < 0 || index > size) {
	        throw new IllegalArgumentException("Invalid index");
	    }

	    Node newNode = new Node(value);
	    if (index == 0) {
	        // Insert at the beginning.
	        newNode.next = head;
	        head = newNode;
	        if (tail == null) {
	            tail = newNode; // Update tail if the list was empty.
	        }
	    } else {
	        Node current = head;
	        for (int i = 1; i < index; i++) {
	            current = current.next;
	        }
	        newNode.next = current.next;
	        current.next = newNode;
	        if (current == tail) {
	            tail = newNode; // Update tail if inserting at the end.
	        }
	    }

	    size++;
	}
	
	//======================================lastIndexof=================================================
	public int lastIndexOf(int target) {
	    int lastIndex = -1; // Initialize to -1 to represent not found.
	    int currentIndex = 0; // Start at the first node.
	    Node current = head; // Start at the head of the list.

	    while (current != null) {
	        if (current.data == target) {
	            lastIndex = currentIndex;
	        }

	        current = current.next;
	        currentIndex++;
	    }

	    return lastIndex;
	}
	
	//====================================Remove all(index)==============================================
	public void removeAll(int value) {
		Node currentNode=head, previousNode=null;
		
		while(currentNode!=null){
			if(currentNode.data==value) {
				if(previousNode==null) {//for head
					head=head.next;
				}else if(currentNode.next==null) { //for tail
					previousNode.next=null;
					tail=previousNode;
				}else {
					previousNode.next=currentNode.next;
					currentNode=currentNode.next;
				}
				size--;
			}
		}
		
		
	}
	
	//=====================================reverse the node============================================
	//Reverse the node
		public void reverseTheNode() {
			Node current=head;
			Node prev=null;
			Node tempNode;
			while(current!=null) {
				 tempNode=current.next;
				 current.next=prev;
				 prev=current;
				 current=tempNode;
			}
			head=prev;
		}

	//=====================================Main Method==================================================
	public static void main(String[] args) {
		SingleLinkedListImplementations obj1 = new SingleLinkedListImplementations();
		
		//1. Adding the Nodes
		for (int data : new int[] { 100, 200, 300, 400, 500 }) {
			obj1.addNode(data);
		}
		
		//2. Display the node 
		obj1.displayNodes();
		
		//3. Get the size;
		System.out.println("The Size of  nodes is :"+ obj1.getSize());
		
		//4. remove nodes in between
		obj1.removeNode(300);
		System.out.println("The nodes after removed");
		obj1.displayNodes();
		System.out.println("The Size of nodes after removing node :"+ obj1.getSize());

		//5. Add All method
		SingleLinkedListImplementations obj2=new SingleLinkedListImplementations();
		for (int data : new int[] { 600, 700, 800 }) {
            obj2.addNode(data);
        }
		obj1.addALL(obj2);
		System.out.println("Linked List 1 after adding elements from List 2:");
	    obj1.displayNodes();
	    System.out.println("Size of Linked List 1: " + obj1.getSize());
		
	    //6.Add ALl at specfic index
	    SingleLinkedListImplementations obj3=new SingleLinkedListImplementations();
		for (int data : new int[] { 900, 1000, 1100 }) {
            obj3.addNode(data);
        }
		obj1.addAll(3, obj3);
		System.out.println("Linked List 1 after adding elements from List 2:");
	    obj1.displayNodes();
	    System.out.println("Size of Linked List 1: " + obj1.getSize());
		
	    //7.Insert value at specfic index
	    obj1.insert(9, 400);
	    System.out.println("Linked List 1 after inserting elements from List 1:");
	    obj1.displayNodes();
	    System.out.println("Size of Linked List 1: " + obj1.getSize());
		
	    //8.get lastIndex of target
	    System.out.println("The last index of 400:"+  obj1.lastIndexOf(400));
	    
	    //9. Reverse the node
	    
	    obj1.reverseTheNode();
	    System.out.println("After Reverse");
	    obj1.displayNodes();
	    
		
	}
}

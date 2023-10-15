package mandatoryHomeWork.week16;

import org.junit.Test;

public class TestTheDoubleLinkedList {
	
	DoubleLinkedListImplementation obj=new DoubleLinkedListImplementation();
	
	@Test
	public void test() {
		obj.addFirst(3);
		obj.displayNodes();
		obj.addFirst(2);
		obj.displayNodes();
		
		obj.addLast(5);
		obj.displayNodes();
		
		obj.removeFirst();
		obj.displayNodes();
		obj.removeLast();
		obj.displayNodes();
		
		System.out.println("Size :"+ obj.getSize());
		
	}

}

package mandatoryHomeWork.week14;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TwoDimensionalMap_RetriveOperations {
	
	
	@Test
	public void test() {
		perform_RetriveOperations_OnTwoDimensionalMap();
	}
	
	public void perform_RetriveOperations_OnTwoDimensionalMap() {
	
	//initialized the nested map
	Map<Integer, Map<Integer,String>> twoDimensionalMap=new HashMap<>();
	
	//Create an inner map
	Map<Integer,String> innerHashMap=new HashMap<Integer, String>();
	
	innerHashMap.put(1, "Govind");
	innerHashMap.put(2, "Raj");
	
	//Add data into two Dimensional Map
	twoDimensionalMap.put(100, innerHashMap);

	
	//We can iterate with entrySetIterator
	
		for (Map.Entry<Integer, Map<Integer, String>> outerEntry : twoDimensionalMap.entrySet()) {
			int outerMapKey = outerEntry.getKey();
			Map<Integer, String> innerMap = outerEntry.getValue();

			for (Map.Entry<Integer, String> innerEntry : innerMap.entrySet()) {
		        // Perform operations using outerKey, innerKey, and value
				int innerkey = innerEntry.getKey();
				String innervalue = innerEntry.getValue();
				System.out.println("Outer Key: " + outerMapKey + ", Inner Key: " + innerkey + ", Value: " + innervalue);
			}
		}
	}
}

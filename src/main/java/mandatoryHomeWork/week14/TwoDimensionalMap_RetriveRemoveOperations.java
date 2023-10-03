package mandatoryHomeWork.week14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class TwoDimensionalMap_RetriveRemoveOperations {
	
	@Test
	public void test() {
		retrive_remove_on_2DimensionalMap();
	}
	
	public void retrive_remove_on_2DimensionalMap() {
		Map<Integer, Map<Integer,String>> twodimensionalMap=new HashMap<>();
		
		//Create first inner map
		
		Map<Integer,String> innerMap1=new HashMap<Integer, String>();
		innerMap1.put(1, "Saravana");
		innerMap1.put(2, "Shivani");
		
		//Create second inner Map
		
		Map<Integer, String>  innerMap2=new HashMap<Integer, String>();
		innerMap2.put(3, "Varun");
		innerMap2.put(4, "Rakshana");
		
		//add to innerMap to outerMap
		
		twodimensionalMap.put(100, innerMap1);
		twodimensionalMap.put(200, innerMap2);
		
		
		Iterator<Map.Entry<Integer, Map<Integer, String>>> outerIterator=twodimensionalMap.entrySet().iterator();
		
		while(outerIterator.hasNext()) {
			Map.Entry<Integer,Map<Integer,String>> outerEntry=outerIterator.next();
			int outerKey=outerEntry.getKey();
			Map<Integer,String> innerMap=outerEntry.getValue();
				//Iterating with innerMap
			Iterator<Map.Entry<Integer, String>> innerIterator=innerMap.entrySet().iterator();
			 
			while (innerIterator.hasNext()) {
				Map.Entry<Integer, String> innerEntry= innerIterator.next();
                int innerKey = innerEntry.getKey();
                String value = innerEntry.getValue();
                
                //Check condition , and if met remove the key inner map key and value
                
                if(innerKey==2) {
                	innerIterator.remove();  // Remove the inner key-value pair
                }
                System.out.println("Outer Key :"+  outerKey + ", Inner Key:"+ innerKey +", value: "+ value);
			}
			
            // Check some condition, and if it's met, remove the outer key
			
			if (outerKey == 100) {
                outerIterator.remove(); // Remove the outer key-value pair
            }
		}
		 // Print the updated map
        System.out.println("Updated Map: " + twodimensionalMap);
	}

}

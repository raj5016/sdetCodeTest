package MapOpeartions;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Assert;
import org.junit.Test;

public class HashMapPractise {
	
	
	@Test
	public void test() {
		hashMapOperation();
	}
	
	public void hashMapOperation() {
		Map<Integer, String>  hmap=new HashMap<Integer, String>();
		Map<Integer, String>  hmap1=new HashMap<Integer, String>();
		//add
		
		hmap.put(1, "Raj");
		hmap.put(2, "Govind");
		hmap.put(1, "Raj1");
		
		
		System.out.println(hmap);
		hmap1.putAll(hmap);
		System.out.println("New hashmap:"+  hmap1);

		
		// remove
		
		hmap.remove(2);
		System.out.println(hmap);
		
		//adding after remove
		//hmap.put(2, "Govind");
		//hmap.put(1, "Raj1");
		
		//containsKey
		
		Assert.assertTrue(hmap.containsKey(1));
		
		//get or getOrDefault
		
		System.out.println(hmap.get(1));
		
		System.out.println(hmap.getOrDefault(3, "Testleaf"));
		System.out.println(hmap);

		//Iteration
		
		for (Map.Entry<Integer, String> entryvalues:hmap.entrySet()) {
			System.out.println("Key :" + entryvalues.getKey() + "Value :" + entryvalues.getValue());
		}
		
		
		System.out.println("After remove new hashmap:"+ hmap1);
		
		Iterator<Map.Entry<Integer, String>> itr=hmap.entrySet().iterator();
		
		while(itr.hasNext()) {
			Entry<Integer,String>   entry=itr.next();
			System.out.println("Key :" + entry.getKey() + "Value :" + entry.getValue());
		}
		 
		Collection<String> hmapvalues=hmap.values();
		
		for (String value : hmapvalues) {
			System.out.println("Values :" + value);
		}
		
		
	}

}

package MapOpeartions;

import java.util.HashMap;

public class HashMapPractize {
	
	public static void main(String[] args) {
		HashMap<String, Integer> hmap=new HashMap<String, Integer>();
		hmap.put("SizeOfTheArray", 1);
		findIndex("SizeOfTheArray");
	}
	
	public static void findIndex(String key) {
		int arraySize=16;
		int hashvalue= key.hashCode();    
		
		System.out.println("hashvalue  for given key" + key +"===" +hashvalue);//hashcode=822429280 (for SizeOfTheArray) 
		
		int boxedValue=hashvalue>>16;     // does 16 times right shift operator
		
		System.out.println("Boxed binary value is :" + boxedValue);  // 12549
		
		System.out.println("Index value is :"+  ((arraySize-1)&boxedValue)) ;        //5 index value

	}

}

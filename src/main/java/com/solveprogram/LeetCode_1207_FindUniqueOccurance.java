package com.solveprogram;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_1207_FindUniqueOccurance {
	
	
	//1207-https://leetcode.com/problems/unique-number-of-occurrences/description/
	@Test
	public void test1() {
		Assert.assertEquals(true, uniqueOccurrences(new int[] {1,2,1,2,1,3}));
	}
	
	
	public boolean uniqueOccurrences(int[] arr) {
		
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        
        for(int i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
    
        HashSet<Integer>set=new HashSet<Integer>(map.values());
        int n=map.size();
        int m=set.size();
        if(n==m){
            return true;
        }
        return false;
    }
}
	
	
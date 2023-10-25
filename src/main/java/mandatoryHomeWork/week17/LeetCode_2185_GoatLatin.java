package mandatoryHomeWork.week17;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_2185_GoatLatin {
	//https://leetcode.com/problems/goat-latin/description/
	
	@Test
	public void test() {
		Assert.assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", toGoatLatin("I speak Goat Latin"));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa", toGoatLatin("The quick brown fox jumped over the lazy dog"));
	}
	
	
	 public boolean isVowel(char c){
	        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') return true;
	        return false;
	    }
	 
	 public String toGoatLatin(String sentence) {
	        String[] words=sentence.split(" ");
	        
	        StringBuilder sb=new StringBuilder("");
	        
	        //After performing action every time, a will be appended i.e. incremented
	        StringBuilder p=new StringBuilder("a");
	        
	        for(String word : words){
	            String lowerrcase_word=word.toLowerCase();
	            
	            if(isVowel(lowerrcase_word.charAt(0))){
	                sb.append(word+"ma");
	                sb.append(p+" ");
	                p.append("a");
	            }else{   //speak.substring(1)  --peak && speak.charAt(0) --s  
	                sb.append(word.substring(1)+word.charAt(0)+"ma"+p+" ");
	                p.append("a");
	            }
	        }
	        return sb.toString().trim();
	    }
	}


package mandatoryHomeWork.week17;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_832_FlippingAnImage {
	
	@Test
	public void test() {
		    int[][] inputImage = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
		    int[][] expectedOutput = {{1, 0, 0}, {0, 1, 0}, {1, 1, 1}};
		    int[][] transformedImage = flipAndInvertImage(inputImage);
		    Assert.assertArrayEquals(expectedOutput, transformedImage);
	}
	
	
	public int[][] flipAndInvertImage(int[][] image) {
		
		for (int i = 0; i < image.length; i++) {
			int start=0;
			int end=image[i].length-1;
			while(start<end) {
				int temp=image[i][start];
				image[i][start]=image[i][end];
				image[i][end]=temp;
				start++;
				end--;
			}
		}
        
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[i].length; j++) {
				if(image[i][j]==0) {
					image[i][j]=1;
				}else if(image[i][j]==1) {
					image[i][j]=0;
				}
			}
		}
		return image;
    }
}

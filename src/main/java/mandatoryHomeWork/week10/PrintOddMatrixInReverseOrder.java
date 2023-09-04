package mandatoryHomeWork.week10;

import org.junit.Assert;
import org.junit.Test;

public class PrintOddMatrixInReverseOrder {
	

	@Test
	public void test1() {
		int[][] mat = {{1,2},{3,4}};
		int[] res = {1,2,4,3};
		Assert.assertArrayEquals(res, printMatrix(mat));
	}

	@Test
	public void test2() {
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		int[] res = {1,2,3,6,5,4,7,8,9};
		Assert.assertArrayEquals(res, printMatrix(mat));
	}

	
	 public static int[] printMatrix(int mat[][]){
		 	int size = mat.length;
			int[] res = new int[size * size];
			int index = 0;

			for (int i = 0; i < size; i++) {
				if (i % 2 == 0) {  
					for (int j = 0; j < size; j++) {
						res[index++] = mat[i][j];
					}
				} else {
					for (int j = size - 1; j >= 0; j--) {
						res[index++] = mat[i][j];
					}
				}
			}

			return res;
}
}
package mandatoryHomeWork.week11;

public class LeetCode_75_SortTheArrays0s1s2s {
	
	public static void sortTheArray(int[] arr) {
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j]){
					 temp=arr[j];                  
	                 arr[j]=arr[i];                  
	                 arr[i]=temp; 
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		LeetCode_75_SortTheArrays0s1s2s.sortTheArray(new int[] {2,1,0,1,2,0,1,2,0});
		System.out.println("   " );
		LeetCode_75_SortTheArrays0s1s2s.sortTheArray(new int[] {3,12,4,67,23,14,89,5});

	}
	
	public int[] sortColors(int[] nums) {
	    // 2-pass
	    int count0 = 0, count1 = 0, count2 = 0;
	    for (int i = 0; i < nums.length; i++) {
	        if (nums[i] == 0) {count0++;}
	        if (nums[i] == 1) {count1++;}
	        if (nums[i] == 2) {count2++;}
	    }
	    for(int i = 0; i < nums.length; i++) {
	        if (i < count0) {nums[i] = 0;}
	        else if (i < count0 + count1) {nums[i] = 1;}
	        else {nums[i] = 2;}
	    }
		return nums;
	}
	
	


}

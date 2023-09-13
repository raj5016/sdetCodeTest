package mandatoryHomeWork.week11;

public class SortTheArrays0s1s2s {
	
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
		SortTheArrays0s1s2s.sortTheArray(new int[] {2,1,0,1,2,0,1,2,0});
		System.out.println("   " );
		SortTheArrays0s1s2s.sortTheArray(new int[] {3,12,4,67,23,14,89,5});

	}
	
	


}

//Time complexity: O(n^2)
public class SelectionSort
{
	public static void main(String[] args) {
		int arr[] = {5, 4, 2, 3, 1};
		System.out.print("Array is sorted: ");
		selectionSort(arr);
		for(int i = 0; i < arr.length;i++){
		    System.out.print(arr[i] + " ");
		}
	}
	public static void selectionSort(int[] arr){
	    for(int i = 0; i < arr.length-1 ;i++ ){
	        int smallest = i;
	        for(int j = i + 1; j < arr.length ;j++){
	            if(arr[smallest] > arr[j]){
	                int temp = arr[smallest];
	                arr[smallest] = arr[j];
	                arr[j] = temp;
	            }
	        } 
	    }
	}
}

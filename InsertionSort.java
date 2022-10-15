//Time Complexity: O(N^2)

//Code
import java.util.Arrays;
public class InsertionSort
{
	public static void main(String[] args) {
	    int arr[] = {5, 3, 4, 2, 1};
		System.out.print("Array is sorted: ");
		insertionSort(arr);
		System.out.print(Arrays.toString(arr));
	}
	public static void insertionSort(int[] arr){
	    for(int i = 0; i < arr.length - 1; i++){
	        for(int j = i + 1; j > 0; j--){
	            // sort only if 
	            if(arr[j] < arr[j - 1]){
	                int temp = arr[j];
	                arr[j] = arr[j-1];
	                arr[j-1] = temp;
	            }
	            //if nor break the loop
	            else
	                break;
	        }
	    }
	}
}

OUTPUT:
Array is sorted: [1, 2, 3, 4, 5]

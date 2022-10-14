//Time Complexity: O(n^2)
public class BubbleSort
{
	public static void main(String[] args) {
	    int arr[] = {5, 10, 99, 100, 1000};
	    bubbleSort(arr);
	    System.out.print("Array is sorted: ");
	    for(int i = 0; i < arr.length; i++){
		    System.out.print(arr[i] + " ");
	    }
	}
	public static void bubbleSort(int[] arr){
	    for(int i = 0; i < arr.length-1; i++){
	        for(int j = 0; j < arr.length-i-1; j++){
	            if(arr[j] > arr[j+1]){
	                int temp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = temp;
	            }
	        }
	    }
	}
}

OUTPUT:
Array is sorted: 5 10 99 100 1000 

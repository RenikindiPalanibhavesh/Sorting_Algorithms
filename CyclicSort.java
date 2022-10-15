import java.util.Arrays;
public class CyclicSort
{
	public static void main(String[] args) {
	    int arr[] = {5, 3, 4, 2, 1};
		System.out.print("Array is sorted: ");
		cyclicSort(arr);
		System.out.print(Arrays.toString(arr));
		
	}
	public static void cyclicSort(int[] arr){
	    for(int i = 0; i < arr.length; i++){
	        int checkCorrectIndex = arr[i] - 1;
	        if(arr[i] != arr[checkCorrectIndex]){
	         int temp = arr[i];
	         arr[i] = arr[checkCorrectIndex];
	         arr[checkCorrectIndex] = temp;
	        }
	    }
	}
}
/* OUTPUT:
   Array is sorted: [1, 2, 3, 4, 5]
 */

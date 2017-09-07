import java.util.Scanner;

public class CountSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		int[] result = countSort(arr);
		for(int x:result){
			System.out.print(x+" ");
		}
	}

	/**
	 * only for integer array
	 * @param arr
	 * @return
	 */
	public static int[] countSort(int arr[]){
		int n = arr.length;
		
		int min = arr[0],max = arr[0];
		for(int i=0;i<n;i++){
			if(arr[i]<min) min = arr[i];
			if(arr[i]>max) max = arr[i];
		}
		int k = max-min+1;
		int b[] = new int[k];
		for(int i=0;i<n;i++){
			b[arr[i]-min] += 1;
		}
		for(int i=1;i<k;i++){
			b[i] += b[i-1];
		}
		int result[] = new int[n];
		for(int i=n-1;i>=0;i--){
			result[--b[arr[i]-min]] = arr[i];
		}
		return result;
	}
}

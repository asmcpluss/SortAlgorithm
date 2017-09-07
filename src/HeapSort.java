import java.util.Scanner;

public class HeapSort {
	static int[] arr;
	static int length;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		length = n;
		arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		int start = n-1/2;
		for(int i = start;i>=0;i--){
			maxHeapify(i);
		}
		sort();
		for(int val:arr){
			System.out.print(val+" ");
		}
	}

	public static void sort(){
		int n = arr.length-1;
		while(length-->0){
			int temp = arr[length];
			arr[length] = arr[0];
			arr[0] = temp;
			maxHeapify(0);
		}
	}
	public static void maxHeapify(int pos){
		int left = pos*2+1;
		int right = pos*2+2;
		int n = length;
		int maxPos = pos;
		if(left<n){
			if(arr[left]>arr[pos]){
				maxPos = left;
			}
		}
		if(right<n){
			if(arr[right]>arr[maxPos]){
				maxPos = right;
			}
		}
		if(maxPos!=pos){
			int temp = arr[maxPos];
			arr[maxPos] = arr[pos];
			arr[pos] = temp;
			maxHeapify(maxPos);
		}
	}
	
}

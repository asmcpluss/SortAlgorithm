import java.util.Scanner;

public class MergeSort {

	static int[] arr;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		arr= new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scan.nextInt();
		}

		quickSort(0,n-1);
		for(int val:arr){
			System.out.print(val+" ");
		}
	}
	
	public static void quickSort(int begin,int end){
		if(begin<end){
			int mid = (begin+end)/2;
			quickSort(begin,mid);
			quickSort(mid+1,end);
			merge(begin,mid,end);
		}
	}

	public static void merge(int begin,int mid,int end){
		int n = end-begin+1;
		int result[] = new int[n];
		int left = begin,right = mid+1;
		int i = 0;
		while(left<=mid&&right<=end){
			if(arr[left]<arr[right]){
				result[i] = arr[left];
				left += 1;
			}
			else {
				result[i] = arr[right];
				right += 1;
			}
			i += 1;
		}
		if(left<=mid){
			for(int j = left;j<=mid;j++,i++){
				result[i] = arr[j];
			}
		}
		if(right<=end){
			for(int j = right;j<=end;j++,i++){
				result[i] = arr[j];
			}
		}
		for(int j=begin;j<=end;j++){
			arr[j] = result[j-begin];
		}
	}
}

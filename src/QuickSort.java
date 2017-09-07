import java.util.Scanner;

public class QuickSort {

	static int[] arr;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		quickSort(0,n-1);
		for(int val:arr){
			System.out.print(val+" ");
		}
	}

	public static void quickSort(int start,int end){
		int pos = start;
		if(start>=end){
			return;
		}
		int i = start+1,j = end;
		int key = arr[start];
		while(i<j){
			if(arr[i]<=key){
				i += 1;
			}
			if(arr[j]>key){
				j -=1;
			}
			if(i>=j) break;
			if(arr[i]>key&&arr[j]<=key){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i+=1;
				j-=1;
			}
		}
		if(arr[i]>key){
			arr[start] = arr[i-1];
			arr[i-1] = key;
			pos = i-1;
		}
		if(arr[i]<key){
			arr[start] = arr[i];
			arr[i] = key;
			pos = i;
		}
		quickSort(start,pos-1);
		quickSort(pos+1,end);
	}
}

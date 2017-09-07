import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		//sort segment
		for(int i = 0;i<n;i++){
			for(int j = 0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int x:arr){
			System.out.print(x+" ");
		}
	}

}

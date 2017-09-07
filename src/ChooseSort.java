import java.util.Scanner;

public class ChooseSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		//sort segment
		for(int i = 0;i<n;i++){
			int pos = i;
			for(int j = i+1;j<n;j++){
				if(arr[j]<arr[pos]){
					pos = j;
				}
			}
			if(pos!=i){
				int temp = arr[i];
				arr[i] = arr[pos];
				arr[pos] = temp;
			}
		}
		for(int x:arr){
			System.out.print(x+" ");
		}
	}

}

import java.util.Scanner;

public class InsertSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		int output[] = new int[n];
		int end = 0;
		output[end] = arr[0];
		end+=1;
		for(int i=1;i<n;i++){
			int pos = end;
			for(int j = 0;j<end;j++){
				if(arr[i]<output[j]){
					pos = j;
					break;
				}
			}
			for(int k=end;k>pos;k--){
				output[k] = output[k-1];
			}
			output[pos] = arr[i];
			end += 1;
		}
		for(int val:output){
			System.out.print(val+" ");
		}
	}

}

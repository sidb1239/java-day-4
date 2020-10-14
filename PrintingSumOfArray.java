package lu;
import java.util.Scanner;

public class PrintingSumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[5];
		for(int i=0;i<5;i++) {
			arr[i]= sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<5;i++) {
			 sum += arr[i];
		}
		System.out.println("sum of array is: "+sum);
		

	}

}

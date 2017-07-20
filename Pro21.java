package Pro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro21 {
public static void main(String[] args) throws NumberFormatException, IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter the size of array");
	int n = Integer.parseInt(br.readLine());
	int[] a = new int[n];
	int[] b = new int[n/2];
	int[] c = new int[(n-(n/2))];
	int sum1 = 0;
	int sum2 = 0;
	System.out.println("Enter the array");
	for(int i=0;i<n;i++){
		a[i] = Integer.parseInt(br.readLine());
	}
	if(n%2!=0){
	for(int j=0;j<(n/2+1);j++){
		//b[j] = a[j];
		sum1 = sum1+a[j];
		System.out.print(a[j]);
	}
	//System.out.println(sum1);
	
	for(int j=n/2+1;j<n;j++){
		//c[j] = a[j];
		sum2 = sum2+a[j];
		System.out.print(a[j]+" ");
	}
	//System.out.println(sum1+ " " + sum2);
	if(sum1 == sum2)
		System.out.println("\nPossible");
	else
		System.out.println("\nNot Possible");  }
	else
		
	{
		for(int j=0;j<(n/2);j++){
			//b[j] = a[j];
			sum1 = sum1+a[j];
			System.out.print(a[j]+" ");
		}
		//System.out.println(sum1);
		
		for(int j=n/2;j<n;j++){
			//c[j] = a[j];
			sum2 = sum2+a[j];
			System.out.print(a[j]+" ");
		}
	//	System.out.println(sum1+ " " + sum2);
		if(sum1 == sum2)
			System.out.println("\nPossible");
		else
			System.out.println("\nNot Possible");
	}
}
}

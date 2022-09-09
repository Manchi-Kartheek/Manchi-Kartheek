package P1;
import java.util.*;
public class Array1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of an array : ");
	int n = sc.nextInt();
	int[]  a = new int[n];
	System.out.println("Enter the elements of an array");
	for (int i = 0; i < n; i++)
	{
		a[i]=sc.nextInt();
	}
	
	System.out.println("The given array elements are ");
	for (int i = 0; i < n; i++)
	{
		System.out.println(a[i]);
	}
	
}
}

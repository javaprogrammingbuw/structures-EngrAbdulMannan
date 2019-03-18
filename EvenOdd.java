import java.util.Scanner;

//loops

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
		
		System.out.print("Enter a number ");
		int n =scan.nextInt();
	for (int i =0;i<n;i++)
	{
		if (i%2!=0) {
			System.out.println("Odd nos are "+i);
		}
	}
	}
	
}

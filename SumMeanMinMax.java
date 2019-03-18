import java.util.Scanner;


public class SumMeanMinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number a");
		int a = scan.nextInt();
		System.out.print("Enter a number b");
		int b = scan.nextInt();
		System.out.print("Enter a number c");
		int c = scan.nextInt();
		
		/*
		 * Todo: Print the sum, mean, max Value and min Value of a, b and c.
		 * */
		int sum=(a+b+c);
				System.out.println("sum is "+sum);
		int mean=(a+b+c)/3;
				System.out.println("mean is "+mean);
	if (a>b && a>c) {
		System.out.println("max is "+a);
	}
	if (b>a && b>c) {
		System.out.println("max is "+b);
	}
	if (c>a && c>a) {
		System.out.println("max is "+c);
	}
	if (a<b && a<c) {
		System.out.println("min is "+a);
	}
	if (b<a && b<c) {
		System.out.println("min is "+b);
	}
	if (c<a && c<a) {
		System.out.println("min is "+c);
	}
	}

}

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a numer");
		int a=sc.nextInt();
		if(a<0)
			System.out.println("invalid");
		else if(a%2==0)
			{
				System.out.println("given number is even");
			}
			else
			{
				System.out.println("given number is odd");
			}
		
	
	}
}


import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		System.out.println("enter a power value");

		int b=sc.nextInt();
		double c= Math.pow(a,b);
		{
			System.out.println(c);
		}
	}

}

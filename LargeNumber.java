import java.util.Scanner;

public class LargeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>=b)
		{
			System.out.println("a is biggest value ");
		}
		else if(b>=c)
		{
			System.out.println("b is biggest value");
		}
		else if(c>=a)
		{
			System.out.println("c is biggest value");
		}
	}

}

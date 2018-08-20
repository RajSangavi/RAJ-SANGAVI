import java.util.Scanner;

public class NTimes {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String a=sc.nextLine();
		System.out.println("enter a number");
		int b=sc.nextInt();
		for(int i=0;i<b;i++)
		{
			System.out.println(a);
		}
		
	}

}

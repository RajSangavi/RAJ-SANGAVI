import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a numbers");
		int a=sc.nextInt();
		for(int i=0;i<=0;i++)
		{
			if(a==0)
			{
				System.out.println("zero");
			}
			else if(a>=0)
			{
				System.out.println("positive");
			}
			else
			{
				System.out.println("negative");
			}
		}
		
	}

}

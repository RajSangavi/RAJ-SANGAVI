import java.util.Scanner;

public class Sum {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int arr[]=new int[a];
		int sum=0;
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<b;i++)
		{
			sum=sum+arr[i];
			
		}
		System.out.println(sum);
		
	}

}

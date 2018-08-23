import java.util.Scanner;

public class NumberReverse {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int a=sc.nextInt();
	int reverse=0;
	while(a!=0)
	{
		int b=a%10;
		reverse=reverse*10+b;
		a/=10;
	}
	System.out.println("reversed number: "+reverse);
}
}

import java.util.Scanner;

public class LeapOrnot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a year");
	int a=sc.nextInt();
	if(a%4==0)
	{
		System.out.println("given year is a leap year");
	}
	else
	{
		System.out.println("given year is not a leap year");
	}
}
}

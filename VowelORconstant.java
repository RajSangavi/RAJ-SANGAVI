import java.util.Scanner;

public class VowelORconstant {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a character");
	char ch=sc.next().charAt(0);
	
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("given character is vowel");
		}
	
	else if(ch>='a'&&ch<='z')
	{
		System.out.println("given character is constant");
	}
	else
	{
		System.out.println("invalid");
	}
	}
}


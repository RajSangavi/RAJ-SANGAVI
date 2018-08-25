import java.util.Scanner;

public class Swap {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String a=sc.nextLine();
		//for(int i=0;i<a.length();i++)
		{
			String b="";
			 b=a.substring(1,2);
		System.out.println(b);
		String c="";
		c=a.substring(0,1);
		System.out.println(c);
		String d="";
	    d=a.substring(3,4);
	    System.out.println(d);
	    String e="";
		e=a.substring(2,3);
		System.out.println(e);
		String f="";
		f=b+c+d+e;
		System.out.println(f);
		}
		}
}

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String a=sc.nextLine();
		StringBuffer sb=new StringBuffer(a);
		System.out.println(sb.reverse());
	}

}

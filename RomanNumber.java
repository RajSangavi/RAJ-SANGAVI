import java.util.Scanner;

public class RomanNumber {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int a=sc.nextInt();
//int num=a;
for(int i=1;i<10;i++)
{
	System.out.println(a+"*"+i+"="+a*i);
}
}
}

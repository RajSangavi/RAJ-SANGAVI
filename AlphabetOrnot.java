import java.util.Scanner;

public class AlphabetOrnot {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter a character");
char ch=sc.next().charAt(0);
if(ch>'a' && ch<'z')
{
	System.out.println("given character is alphabet");
}
else
{
	System.out.println("No");
}
	}

}

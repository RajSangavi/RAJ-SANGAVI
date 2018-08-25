import java.util.Scanner;

public class ArmstrongOrNot 
{
	public static void main(String[] args)
	{
	      
		int a, originalNumber, remainder, result = 0;
	      Scanner sc=new Scanner(System.in);
	    		  System.out.println("enter a string value");
	      a=sc.nextInt();
	      originalNumber = a;

	        while (originalNumber != 0)
	        {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, 3);
	            originalNumber /= 10;
	        }

	        if(result == a)
	            System.out.println(a + " is an Armstrong number.");
	        else
	            System.out.println(a + " is not an Armstrong number.");
	    }
}

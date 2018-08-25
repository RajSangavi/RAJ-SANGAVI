import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args)
	{
	int a, b;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number");
    a = sc.nextInt();
    System.out.println("enter the second number");
    b = sc.nextInt();

    for (int i = a; i<b; i++){
       int c, d, sum = 0;
       c = i;
       while(c!= 0) {
          d= c % 10;
          sum = sum + (d* d * d);
          c = c / 10;
       }
       if(sum == i)
       {
          System.out.println(""+i+" is an Armstrong number.");
       }
    }
 }


}

package Student;
import java.util.Scanner;
public class SquareCalculations {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length");
		int a= sc.nextInt();
		int b=4*a;
		int c=a*a;
		System.out.println("The perimeter of Square is:"+b);
		System.out.println("The area of Square is:"+c);
	}

}

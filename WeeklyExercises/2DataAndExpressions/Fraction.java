package Student;
import java.util.Scanner;
public class Fraction {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter numerator:");
		int a= sc.nextInt();
		System.out.println("Enter denominator:");
		int b= sc.nextInt();
		float c=(float)a/b;
		System.out.println("The decimal value of fraction is:"+c);
	}
}

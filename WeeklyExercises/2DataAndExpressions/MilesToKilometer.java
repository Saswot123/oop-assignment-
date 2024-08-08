package Student;
import java.util.Scanner;
public class MilesToKilometer {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter miles: ");
		float s= sc.nextFloat();		
		System.out.println("The miles in kilometer is:");
		
		float b=s*1.60935f;
		
		System.out.println(b);
	}
}

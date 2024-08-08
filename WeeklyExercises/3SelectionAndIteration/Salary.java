package students;
import java.util.Scanner;
import java.text.NumberFormat;

public class Salary {

	public static void main(String[] args) {
		double raise=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the current salary:");
		double currentSalary = sc.nextDouble();
		System.out.print("Enter the perfomace rating(Excellent,Good,or poor):");
		String rating =sc.next().toLowerCase();
		if(rating.equals("excellent")) {
			
			raise=currentSalary * 0.06;
		}
		else if(rating.equals("good")){
			
			 raise= currentSalary*0.04;
		}
		else if (rating.equals("poor")) {
			
			raise=currentSalary*0.015;
		}
		else {
			
			System.out.print("Invalid input");
		}
		double newSalary=currentSalary+raise;
		NumberFormat money= NumberFormat.getCurrencyInstance();
		System.out.println();
		System.out.println("Current Salary:"+money.format(currentSalary));
		System.out.println("amount of your raise: "+money.format(raise));
		System.out.println("Your new Salary:"+money.format(newSalary));
		
	}

}

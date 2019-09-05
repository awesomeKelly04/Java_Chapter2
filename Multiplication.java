/** Multiplication*/
import java.util.Scanner;

public class Multiplication{
	//main method
	public static void main (String[] arg){		
		int number1, number2;
		String name;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		name = input.nextLine();
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.println("Enter second integer: ");
		number2 = input.nextInt();
		
		SumMul object = new SumMul();
		System.out.printf("%s, the multiplication of the two numbers is %d%n", name, object.multify(number1, number2));		
	}
}

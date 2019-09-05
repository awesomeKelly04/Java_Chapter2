import java.util.Scanner;

public class Arithmetic{
	public static void main (String[] args){
		int number1, number2, sum, product, difference, quotient;
		Scanner input = new Scanner(System.in);
		
		System.out.println("A program to calculate the sum, product, difference, quotient of two (2) integers");
		System.out.print("Enter first number: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		product = number1 * number2;
		difference = number1 - number2;
		quotient = number1 / number2;
		
		System.out.printf("The sum is %d%nThe product is %d%nThe difference is %d%nThe quotient is %d%n", sum, product, difference, quotient);
	}
}
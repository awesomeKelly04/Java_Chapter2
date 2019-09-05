import java.util.Scanner;

public class ComparingInteger{
	public static void main (String[] args){
		int number1, number2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nA program to Comparing Integer");
		System.out.print("Enter first number: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		number2 = input.nextInt();
		
		if(number1 > number2)
			System.out.printf("%d is larger%n", number1);
		
		if(number2 > number1)
			System.out.printf("%d is larger%n", number2);
			
		if(number1 == number2)
			System.out.println("These numbers are equal\n");
	}
}
import java.util.Scanner;

public class Multiples{
	public static void main (String[] args){
		int number1, number2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nA program to determines whether the first is a multiple of the second\n");
		System.out.print("Enter first number: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		number2 = input.nextInt();
		
		if(number1 % number2 == 0)
			System.out.printf("%d is a multiples of %d%n", number1, number2);
		
		if(number1 % number2 != 0)
			System.out.printf("%d is not a multiples of %d%n", number1, number2);	
	}
}
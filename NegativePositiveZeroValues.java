import java.util.Scanner;

public class NegativePositiveZeroValues{
	public static void main (String[] args){
		int number1, number2, number3, number4, number5;
		int numOfNeg = 0, numOfPos = 0, numOfZeros = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nA program to determines Negative, Positive and Zero Values\n");
		System.out.print("Enter first number: ");
		number1 = input.nextInt();
		
		if (number1 < 0){
			numOfNeg = numOfNeg + 1;
		}
		
		if (number1 > 0){
			numOfPos = numOfPos + 1;
		}
		
		if (number1 == 0){
			numOfZeros = numOfZeros + 1;
		}
		
		System.out.print("Enter second number: ");
		number2 = input.nextInt();
		
		if (number2 < 0){
			numOfNeg = numOfNeg + 1;
		}
		
		if (number2 > 0){
			numOfPos = numOfPos + 1;
		}
		
		if (number2 == 0){
			numOfZeros = numOfZeros + 1;
		}
		
		System.out.print("Enter third number: ");
		number3 = input.nextInt();
		
		if (number3 < 0){
			numOfNeg = numOfNeg + 1;
		}
		
		if (number3 > 0){
			numOfPos = numOfPos + 1;
		}
		
		if (number3 == 0){
			numOfZeros = numOfZeros + 1;
		}
		
		System.out.print("Enter forth number: ");
		number4 = input.nextInt();
		
		if (number4 < 0){
			numOfNeg = numOfNeg + 1;
		}
		
		if (number4 > 0){
			numOfPos = numOfPos + 1;
		}
		
		if (number4 == 0){
			numOfZeros = numOfZeros + 1;
		}
		
		System.out.print("Enter fifth number: ");
		number5 = input.nextInt();
		
		if (number5 < 0){
			numOfNeg = numOfNeg + 1;
		}
		
		if (number5 > 0){
			numOfPos = numOfPos + 1;
		}
		
		if (number5 == 0){
			numOfZeros = numOfZeros + 1;
		}
		
		System.out.printf("The number of negative number(s) is equal to %d%nThe number of positive number(s) is equal to %d%nThe number of zero number(s) is equal to %d%n", numOfNeg, numOfPos, numOfZeros);
	}
}
import java.util.Scanner;

public class SeparatingDigitsInteger{
	public static void main (String[] args){
		int number;
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nA program to Separate the Digits in an Integer\n");
		System.out.print("Enter a five digits number: ");
		number = input.nextInt();
		
		if (number/10000 >= 1 && number/10000 <= 9){
			System.out.printf("%d   %d   %d   %d   %d%n", number/10000, (number/1000)%10, (number/100)%10, (number/10)%10, number%10);
		}
		
		if (number/10000 >= 10){
			System.out.printf("%d is more than five digits integer%n", number);
		}	
		
		if (number/10000 < 1){
			System.out.printf("%d is less than five digits integer%n", number);
		}
	}
}
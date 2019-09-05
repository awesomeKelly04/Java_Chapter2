import java.util.Scanner;

public class OddOrEven{
	public static void main (String[] args){
		int number;
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nA program to tell Odd or Even\n");
		System.out.print("Enter number: ");
		number = input.nextInt();
		
		if(number % 2 == 0)
			System.out.printf("%d is EVEN%n", number);
		
		if(number % 2 == 1)
			System.out.printf("%d is ODD%n", number);	
	}
}
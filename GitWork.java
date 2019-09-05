import java.util.Scanner;
public class GitWork{
	public static void main(String[] args){
		int num1, num2, reminder = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("A program to calculate the reminder of two (2) integers");
		System.out.print("Enter first number: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		number2 = input.nextInt();
		
		reminder = number1 % number2;
		
		System.out.printf("The reminder is %d%n", reminder);	
	}
}
import java.util.Scanner;

public class Equation{
	public static void main (String[] args){
		int a, x, y;
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nA program to solve y = ax^3 + 7\n");
		System.out.print("Enter the value for a: ");
		a = input.nextInt();
		
		System.out.print("Enter the value for x: ");
		x = input.nextInt();
		
		//y = a * x * x * x + 7; // Correct
		//y = a * x * x * (x + 7); // Wrong
		//y = (a * x) * x * (x + 7); // Wrong
		//y = (a * x) * x * x + 7; // Correct
		//y = a * (x * x * x) + 7; // Correct
		y = a * x * (x * x + 7);  
		
		System.out.printf("The value for y is %d%n", y);
	}
}
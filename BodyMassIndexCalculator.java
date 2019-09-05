import java.util.Scanner;

public class BodyMassIndexCalculator{
	public static void main (String[] args){
		double weight, height;
		double BMI = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nA program to determines Body Mass Index\n");
		System.out.print("Enter your weight in kilograms: ");
		weight = input.nextDouble();
		
		System.out.print("Enter your height in meters: ");
		height = input.nextDouble();
		
		BMI = weight/(height*height);
		
		System.out.printf("Your body mass index is %.1f%n%n", BMI);
		System.out.println("BMI VALUES");
		System.out.printf("Underweight:\tless than %.1f%n", 18.5);
		System.out.printf("Normal:\t\tbetween %.1f and %.1f%n", 18.5, 24.9);
		System.out.printf("Overweight:\tbetween %d and %.1f%n", 25, 29.9);
		System.out.printf("Obese:\t\t%d or greater%n", 30);
	}
}
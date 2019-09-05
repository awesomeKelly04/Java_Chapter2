import java.util.Scanner;

public class DiameterCircumferenceAreaOfACircle{
	public static void main (String[] args){
		int radius;
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nA program to determines the Diameter, Circumference and Area of a Circle\n");
		System.out.print("Enter radius: ");
		radius = input.nextInt();
		
		System.out.printf("The diameter is equal to %d%nThe circumference is equal to %f%nThe area is equal to %f%n", 2*radius, 2*Math.PI*radius, Math.PI*radius*radius);
	}
}
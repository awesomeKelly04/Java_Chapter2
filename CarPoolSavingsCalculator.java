import java.util.Scanner;

public class CarPoolSavingsCalculator{
	public static void main (String[] args){
		double totalMilesDrivenPerDay, costPerGallon, averageMilesPerGallon, parkingFeesPerDay, TollsPerDay;
		double drivingCost = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nA program to calculates your daily driving cost\n");
		System.out.println("***********************************************\n");
		System.out.print("Enter the total miles driven per day: ");
		totalMilesDrivenPerDay = input.nextDouble();
		
		System.out.print("Enter the cost per gallon of gasoline: ");
		costPerGallon = input.nextDouble();
		
		System.out.print("Enter the average miles per gallon: ");
		averageMilesPerGallon = input.nextDouble();
		
		System.out.print("Enter the parking fees per day: ");
		parkingFeesPerDay = input.nextDouble();
		
		System.out.print("Enter the tolls per day: ");
		TollsPerDay = input.nextDouble();
		
		drivingCost = (totalMilesDrivenPerDay / averageMilesPerGallon) * costPerGallon + parkingFeesPerDay + TollsPerDay;
		
		System.out.printf("%nYour daily driving cost N%.2f%n", drivingCost);
		System.out.printf("You might save N%.0f when you use car pool, %nassuming the car can carry %d passengers%n", drivingCost - (drivingCost / 4), 4);
	}
}


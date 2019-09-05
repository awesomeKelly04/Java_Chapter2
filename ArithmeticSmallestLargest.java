import java.util.Scanner;

public class ArithmeticSmallestLargest{
	public static void main (String[] args){
		int number1, number2, number3, sum, product, average, smallest = 0, largest = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("A program to perform Arithmetic calculations, \nFind the Smallest and Largest");
		System.out.print("Enter first number: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		number2 = input.nextInt();
		
		System.out.print("Enter third number: ");
		number3 = input.nextInt();
		
		sum = number1 + number2 + number3;
		average = sum / 3;
		product = number1 * number2 * number3;
		
		if(number1 > number2 && number1 > number3){
			largest = number1;
			if(number2 < number3){
				smallest = number2;				
			}
			if(number2 > number3){
				smallest = number3;
			}
		}
		
		if(number2 > number3 && number2 > number1){
			largest = number2;
			if(number1 < number3){
				smallest = number1;				
			}
			if(number1 > number3){
				smallest = number3;
			}
		}
		
		if(number3 > number2 && number3 > number1){
			largest = number3;
			if(number2 < number1){
				smallest = number2;				
			}
			if(number2 > number1){
				smallest = number1;
			}
		}
		
		if(number2 == number3 && number2 == number1){
			smallest = number1;
			largest = number1;
		}
		
		System.out.printf("The sum is %d%nThe average is %d%nThe product is %d%n", sum, average, product);
		
		if(largest != smallest)
			System.out.printf("The largest is %d%nThe smallest is %d%n", largest, smallest);
		
		if(largest == smallest)
			System.out.println("These numbers are equal\n");
	}
}
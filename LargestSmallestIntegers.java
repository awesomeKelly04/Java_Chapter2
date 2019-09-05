import java.util.Scanner;

public class LargestSmallestIntegers{
	public static void main (String[] args){
		int number1, number2, number3, number4, number5, smallest = 0, largest = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("A program to find the Smallest and Largest integers");
		System.out.print("Enter first number: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		number2 = input.nextInt();
		
		System.out.print("Enter third number: ");
		number3 = input.nextInt();
		
		System.out.print("Enter forth number: ");
		number4 = input.nextInt();
		
		System.out.print("Enter fifth number: ");
		number5 = input.nextInt();
		
		if(number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5){
			largest = number1;
			if(number2 < number3 && number2 < number4 && number2 < number5){
				smallest = number2;				
			}
			if(number2 > number3 && number3 < number4 && number3 < number5){
				smallest = number3;
			}
			if(number2 > number3 && number3 > number4 && number4 < number5){
				smallest = number4;
			}
			if(number2 > number3 && number3 > number4 && number4 > number5){
				smallest = number5;
			}
		}
		
		if(number1 < number2 && number2 > number3 && number2 > number4 && number2 > number5){
			largest = number2;
			if(number1 < number3 && number1 < number4 && number1 < number5){
				smallest = number1;				
			}
			if(number1 > number3 && number3 < number4 && number3 < number5){
				smallest = number3;
			}
			if(number1 > number3 && number3 > number4 && number4 < number5){
				smallest = number4;
			}
			if(number1 > number3 && number3 > number4 && number4 > number5){
				smallest = number5;
			}
		}
		
		if(number1 < number3 && number2 < number3 && number3 > number4 && number3 > number5){
			largest = number3;
			if(number1 < number2 && number1 < number4 && number1 < number5){
				smallest = number1;				
			}
			if(number1 > number2 && number2 < number4 && number2 < number5){
				smallest = number2;
			}
			if(number1 > number2 && number2 > number4 && number4 < number5){
				smallest = number4;
			}
			if(number1 > number2 && number2 > number4 && number4 > number5){
				smallest = number5;
			}
		}
		
		if(number1 < number4 && number2 < number4 && number3 < number4 && number4 > number5){
			largest = number4;
			if(number1 < number2 && number1 < number3 && number1 < number5){
				smallest = number1;				
			}
			if(number1 > number2 && number2 < number3 && number2 < number5){
				smallest = number2;
			}
			if(number1 > number2 && number2 > number3 && number3 < number5){
				smallest = number3;
			}
			if(number1 > number2 && number2 > number3 && number3 > number5){
				smallest = number5;
			}
		}
		
		if(number1 < number5 && number2 < number5 && number3 < number5 && number4 < number5){
			largest = number5;
			if(number1 < number2 && number1 < number3 && number1 < number4){
				smallest = number1;				
			}
			if(number1 > number2 && number2 < number3 && number2 < number4){
				smallest = number2;
			}
			if(number1 > number2 && number2 > number3 && number3 < number4){
				smallest = number3;
			}
			if(number1 > number2 && number2 > number3 && number3 > number4){
				smallest = number4;
			}
		}
		
		if(number1 == number2 && number2 == number3 && number3 == number4 && number4 == number5){
			smallest = number1;
			largest = number1;
		}
		
		if(largest != smallest)
			System.out.printf("The largest is %d%nThe smallest is %d%n", largest, smallest);
		
		if(largest == smallest)
			System.out.println("These numbers are equal\n");
	}
}
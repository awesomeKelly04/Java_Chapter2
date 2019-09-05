public class IntegerValueOfACharacter{
	public static void main (String[] args){
		System.out.println("\nA program to determines the Integer Value of a Character\n");
		System.out.println("Integer equivalents of the following:\n");
		System.out.println("Character\tValue");
		System.out.printf("%c\t\t%d%n", 'A', ((int) 'A'));
		System.out.printf("%c\t\t%d%n", 'B', ((int) 'B'));
		System.out.printf("%c\t\t%d%n", 'C', ((int) 'C'));
		System.out.printf("%c\t\t%d%n", 'a', ((int) 'a'));
		System.out.printf("%c\t\t%d%n", 'b', ((int) 'b'));
		System.out.printf("%c\t\t%d%n", 'c', ((int) 'c'));
		System.out.printf("%c\t\t%d%n", '0', ((int) '0'));
		System.out.printf("%c\t\t%d%n", '1', ((int) '1'));
		System.out.printf("%c\t\t%d%n", '2', ((int) '2'));
		System.out.printf("%c\t\t%d%n", '$', ((int) '$'));
		System.out.printf("%c\t\t%d%n", '*', ((int) '*'));
		System.out.printf("%c\t\t%d%n", '+', ((int) '+'));
		System.out.printf("%c\t\t%d%n", '/', ((int) '/'));
		System.out.printf("%c\t\t%d%n", ' ', ((int) ' '));
	}
}
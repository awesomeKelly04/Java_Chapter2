import java.util.Scanner;

public class Welcome2{
	public void message (){
		System.out.println();
		System.out.print("\t\bWelcome to\n");
		System.out.println("*************************");
		System.out.println("     Java Programming");
		System.out.println("*************************\r*************************");
		System.out.println("\\");
		System.out.println("God has made me Awesome, so, I am \"Awesome\"");
		System.out.printf("%n%s%n%s%n%s%n", "God has made me Awesome,", "so, I know", "I am \"Awesome\"");
		System.out.printf("%n%s%d%s%n", "When are we getting the ", 3, "million loan...");
	}
	
	public static void main (String[] arg){		
		Welcome2 object = new Welcome2();
		object.message();
	}
}
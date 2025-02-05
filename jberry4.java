/*
 * Jacob Berry
 * CSC321
 * Lab4
 */
import java.util.Scanner;
public class jberry4
{
	public static void main(String[] args) 
	{
		int carChoice = 1;
		String options;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your car choice: ");
		carChoice = input.nextInt();
		switch (carChoice) 
		{
			case 1:
				System.out.println("Toyota");
				break;
			case 2:
				System.out.println("Genesis");
				break;
			case 3:
				System.out.println("Aston Martin");
				break;
			case 4:
				System.out.println("Mercedes");
				break;
		}
	}
}


package calculator;

import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ope,no1,no2;
		loop:
		while (true) {
			System.out.println("1: Addition");
			System.out.println("2: Subtraction");
			System.out.println("3: multiplication");
			System.out.println("4: Division");
			System.out.println("5: exit");
			System.out.println("enter the operation:");

			ope = sc.nextInt();			
			
			System.out.println("Enter the number1: ");
			no1 = sc.nextInt();
			System.out.println("Enter the number2: ");
			no2 = sc.nextInt();

			CalculatorOperations calc = new CalculatorOperations();
			switch (ope) {
			case 1:
				System.out.println("Ans is: "+ calc.addOperation(no1, no2));
				break;
			case 2:
				System.out.println("Ans is: "+ calc.subOperation(no1, no2));
				break;
			case 3:
				System.out.println("Ans is: "+ calc.multiOperation(no1, no2));
				break;
			case 4:
				System.out.println("Ans is: "+ calc.divOperation(no1, no2));
				break;
			case 5:
				System.exit(0);
			}
		}
		
		//sc.close();
	}
}

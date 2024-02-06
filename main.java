package Assignment_1;

import java.util.Scanner;
import java.io.*;

public class main {
	
	public static void main(String args[])
	{
		int option;
		input inp = new input();
		Calculator calc = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. add\n2. subtract\n3. multiply\n4. divide\n5. mean\n6. square\n7. square root\n8. Variance\n9. Exit");
		System.out.println("Enter: ");
		option = sc.nextInt();
		
		switch(option)
		{
			case 1:
				double numbers[] = new double[2];
				numbers = inp.inputNumbers();
				
				System.out.println("The addition of " + numbers[0] + " and " + numbers[1] + " is " + calc.addition(numbers[0],numbers[1]));
				break;
			case 2:
				double sub_num[] = new double[2];
				sub_num = inp.inputNumbers();
				
				System.out.println("The subtraction of " + sub_num[0] + " and " + sub_num[1] + " is " + calc.subtraction(sub_num[0],sub_num[1]));
				break;
			case 3:
				double multiply_num[] = new double[2];
				multiply_num = inp.inputNumbers();
				
				System.out.println("The multiplication of " + multiply_num[0] + " and " + multiply_num[1] + " is " + calc.multiplication(multiply_num[0], multiply_num[1]));
				break;
			case 4:
				double divide_num[] = new double[2];
				divide_num = inp.inputNumbers();
				
				System.out.println("The multiplication of " + divide_num[0] + " and " + divide_num[1] + " is " + calc.division(divide_num[0], divide_num[1]));
				break;
			case 5:
				double local_mean = calc.mean();
				System.out.println("Mean is: " + local_mean);
				break;
			case 6:
				System.out.println("Enter the number to be squared: ");
				double square_num = sc.nextDouble();
				
				System.out.println("The square of " + square_num + " is " + calc.power(square_num, 2));
				break;
			case 7:
				System.out.println("Enter the number: ");
				double square_root_num = sc.nextDouble();
				
				System.out.println("The square root of " + square_root_num + " is " + calc.power(square_root_num, 0.5));
				break;
			case 8:
				double local_variance = calc.var();
				
				System.out.println("Variance is: " + local_variance);
				break;
			case 9:
				break;
			default:
				System.out.println("Error");
		}
	}
}
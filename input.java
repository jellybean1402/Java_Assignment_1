package Assignment_1;

import java.util.Scanner;

public class input {
	
	public double[] inputNumbers()
	{
		Scanner sc = new Scanner(System.in);
		double numbers[] = new double[2];
		System.out.println("Enter first number: ");
		double first = sc.nextDouble();
		System.out.println("Enter second number: ");
		double second  = sc.nextDouble();
		numbers[0] = first;
		numbers[1] = second;
		return numbers;
	}

}

package Assignment_1;

import java.util.*;

public class Calculator 
{
	Scanner sc = new Scanner(System.in);
	
	public double addition(double first, double second)
	{
		return first + second;
	}
	public double subtraction(double first, double second)
	{
		return first - second;
	}
	public double multiplication(double first, double second)
	{
		return first * second;
	}
	public double division(double first, double second)
	{
		return first / second;
	}
	public double power(double first, double second)
	{
		return Math.pow(first, second);
	}
	public double mean()
	{
		String str;
		int ctr = 0;
		double result = 0, no;
	
		do
		{
			System.out.println("Enter Data: ");
			str = sc.next();
			if(str.equals("end"))
			{
				break;
			}
			else
			{
				no = Double.parseDouble(str);
				result += no;
				ctr++;
			}
			
		}while(true);
		return (result/ctr);
	}
	
	public double var()
	{
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		double var_num[] = new double[size];
		double var_sum = 0, var_num_num = 0, variance_numerator = 0, variance = 0;
		for(int i = 0; i < size; i++)
		{
			System.out.println("Enter value " + (i + 1) + ": ");
			var_num[i] = sc.nextDouble();
			var_sum += var_num[i];
			var_num_num++;
		}
		
		double var_mean = var_sum/var_num_num;
		
		for(int i = 0; i < size; i++)
		{
			variance_numerator += power(var_num[i] - var_mean, 2);
		}
		
		variance = variance_numerator / size;
		return variance;
	}

}

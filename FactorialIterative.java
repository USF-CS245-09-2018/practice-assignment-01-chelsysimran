public class FactorialIterative implements Factorial {
	
	public int factorial(int n)
	{
		if (n>0)
		{
			int total = 1;
			for (int i = n; i > 0; i--)
			{
				total *= i;
				
			}
			
			return total;
		}
		return 0;
	}

}

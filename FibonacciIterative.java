public class FibonacciIterative implements Fibonacci {
	
	public int fibonacci(int n)
	{
			
		int num1 = 0, num2 = 1, num3 = 1;
        
		for (int i = 0; i < n; i++) 
        {
            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;
        }
        
		return num1;

	}
		
}
	


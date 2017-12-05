package fibonacci;

public class Fibonacci {
	int n = 1;

	
	public static int fibonacciSolution(int n) {
		if(n == 1) {
			return n;
		}else {
			return fibonacciSolution(n-1) + fibonacciSolution(n-2);
		}
		
	}
}

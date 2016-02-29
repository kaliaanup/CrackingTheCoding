package ModerateProblems;

public class FindSquareRoot {
	
	//Newton Raphson method
	//x^2 = 612
	//f(x) = x^2 - 612
	//f'(x)=2x
	//x1 = x0- f(x0)/f'(x0)
	//x2 = x1 - f(x1)/f'(x1)
	//continue till convergence of xn - xn-1 is 0
	public static double sqrt(int number) {
		double t;
	 
		double squareRoot = number / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return squareRoot;
	}
	
	public static void main(String args[])
	{
			FindSquareRoot inst=new FindSquareRoot();
			System.out.println(inst.sqrt(2));
		
	}
}

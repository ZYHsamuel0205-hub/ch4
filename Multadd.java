public class Multadd {

	public static double multadd (double a, double b, double c) {
		return a * b + c;
	}
	
	public static void main (String[] args) {
		
		double firstNumber = multadd (1.0, 2.0, 3.0);
		System.out.println ("multadd = " + firstNumber);
		
		double secondNumber = multadd (0.5, Math.cos(Math.PI/4), Math.sin(Math.PI/4));
		System.out.println ("multadd = " + secondNumber);
		
		double thirdNumber = multadd (1.0, Math.log(10.0)/Math.log(10.0), Math.log(20.0)/Math.log(10.0));
		System.out.println ("multadd = " + thirdNumber);
		
		System.out.println ("multadd = " + expSum(1.0));
	}
		
	public static double expSum (double x) {
		return multadd (1.0, x * Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
	}
}

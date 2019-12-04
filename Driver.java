

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator Mycalculator = new MyCalculator();

     added a line in feature 1





		// multiply 2 numners
		int int1 = 5;
		int int2 = 10;
		int prod = Mycalculator.Mult(int1, int2);
		System.out.println("Product of " + int1 + " and " + int2 + " is " + prod);

		// add to numbers
		int1 = 5;
		int2 = 10;
		int sum = Mycalculator.Sum(int1, int2);
		System.out.println("Sum of " + int1 + " and  " + int2+  " is " + sum);

		// calculate quotient
		double d1 = 5;
		double d2 = 10;
		double q = Mycalculator.Quot(d1, d2);
		System.out.println("quotient of " + d1 + " and  " + d2 +  " is "  + q);


		// calculate hypotenuse
		double side1 = 3.0;
		double side2 = 4.0;
		double hypot = Mycalculator.Hypot(side1, side2);
		System.out.println("hypot of " + side1 + " and " + side2 + " is " + hypot);


		// get a random number betewwn 1 and 10
		int rnd  = Mycalculator.Random();
		System.out.println("random numner = " + rnd);

		// calculate square root
		int1 = 9;
		double sr = Mycalculator.SquareRoot(int1);
		System.out.println("square root of  " + int1  +" is " +  sr);

	}
}

added line at end in feature 2

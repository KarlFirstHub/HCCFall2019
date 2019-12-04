import java.util.Scanner;

public class GradeCalculator {
	public static void main (String [] args) {
		double totalPoints = 0.0;
		int i = 0;
		Scanner s = new Scanner(System.in);

		//Ask for the 4 homework scores - 25 pts max each; 100 total possible

		for (i = 1; i < 5; i++) {
			System.out.print("Enter homework score " + i + ": ");
			totalPoints = totalPoints + s.nextDouble();
		}

		//Ask for the exam score - 100 total possible
		System.out.println();
		System.out.print("Enter the exam score: ");
		totalPoints = totalPoints + s.nextDouble();

		//Write the loop below to ask for the 5 quiz scores - 20 pts each max
		//it will be similar to the homework loop above (lines 11 - 14)
		//Your code will go between the two lines below that have the asterisks
		//***

		//***

		double percent = calculatePercent(totalPoints);
		char letterGrade = calculateLetterGrade(percent);

		System.out.println();
		System.out.println("The percent is: " + percent + " and the letter grade is: " + letterGrade);
	}

	public static double calculatePercent(double points) {
		return points / 2.0;
		// after adding code for quizes return points / 3.0;
	}

	public static char calculateLetterGrade(double score) {
		//You will have to add to this if statement to handle the 'C' and 'D' grades
		//using a 90-80-70-60 grading scale
		if (score >= 90)
			return 'A';
		else
			if (score >= 80)
				return 'B';
			else
				return 'F';
	}
}
/*Tanvi Biyani
 * Net id: txb160430
 * ITSS 3311.002
 * Hw 11 - test scores
 */
import java.util.Scanner; 

public class testScores {
	

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter score for test 1: ");
		double score1 = sc.nextDouble();
		if(score1 > 100 || score1 < 0) {
			System.out.println("Enter a valid score for test 1: ");
			score1 = sc.nextDouble();
		}
			
		System.out.println("Enter score for test 2: ");
		double score2 = sc.nextDouble();
		if(score2 > 100 || score2 < 0) {
			System.out.println("Enter a valid score for test 2: ");
			score2 = sc.nextDouble();
		}
		System.out.println("Enter score for test 3: ");
		double score3 = sc.nextDouble();
		if(score3 > 100 || score3 < 0) {
			System.out.println("Enter a valid score for test 3: ");
			score3 = sc.nextDouble();
		}
		System.out.println("Enter score for test 4: ");
		double score4 = sc.nextDouble();
		if(score4 > 100 || score4 < 0) {
			System.out.println("Enter a valid score for test 4: ");
			score1 = sc.nextDouble();
		}
		System.out.println("Enter score for test 5: ");
		double score5 = sc.nextDouble();
		if(score5 > 100 || score5 < 0) {
			System.out.println("Enter a valid score for test 5: ");
			score5 = sc.nextDouble();
		}
		double avg = calcAverage(score1, score2, score3, score4, score5);
		
		System.out.println("Grade for test 1: " + testScores.determineGrade(score1));
		System.out.println("Grade for test 2: " + testScores.determineGrade(score2));
		System.out.println("Grade for test 3: " + testScores.determineGrade(score3));
		System.out.println("Grade for test 4: " + testScores.determineGrade(score4));
		System.out.println("Grade for test 5: " + testScores.determineGrade(score5));
		System.out.println("Average score: " + avg);
		System.out.println("Letter grade for average: " + testScores.determineGrade(avg));
	
	}
	
	public static double calcAverage(double score1, double score2, double score3, double score4, double score5) {
		
		double avg;
		avg = (score1 + score2 + score3 + score4 + score5)/5;
		return avg;
		
	}
	
	public static char determineGrade(double score) {
		
		if(score >= 90 && score <= 100)
			return 'A'; 
		if(score >= 80 && score <= 89)
			return 'B';
		if(score >= 70 && score <= 79)
			return 'C';
		if(score >= 60 && score <= 69)
			return 'D';
		if(score < 60)
			return 'F'; 
	
		return ' ';
	}

}
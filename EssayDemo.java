
import java.util.Scanner;

/**
  Mohammed Raza
  CSC 162 - Lab4 #1 (main)
*/

public class EssayDemo
{
   public static void main(String[] args)
   {

	  double score1 = 0.0;
	  int grammar1;
	  int spelling1;
	  int length1;
	  int content1;

	  Scanner keyboard = new Scanner(System.in);

	  System.out.println("Essay Grade Evaluation");
	  System.out.println("");
	  System.out.println("Grammar: 25 pts.");
	  System.out.println("Spelling: 18 pts.");
	  System.out.println("Length: 20 pts.");
	  System.out.println("Content: 25 pts.");

	  System.out.println("");

	  System.out.print("Enter the points for grammar: ");
	  grammar1 = keyboard.nextInt();

	  System.out.print("Enter the points for spelling: ");
	  spelling1 = keyboard.nextInt();

	  System.out.print("Enter the points for length: ");
	  length1 = keyboard.nextInt();

	  System.out.print("Enter the points for content: ");
	  content1 = keyboard.nextInt();

	  System.out.println("");

	  Essay obj = new Essay(grammar1, spelling1, length1, content1);

	  System.out.println("Total Points: " + obj.getScore());
	  System.out.println("Letter Grade: " + obj.getGrade());

   }
}

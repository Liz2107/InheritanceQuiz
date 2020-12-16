import java.util.Scanner;
public class Main {
	//TODO add spaces between ? set
	public static void main(String[] args) {
		introduceClasses();
		askQuestions();
	}
	public static void introduceClasses()
	{
		System.out.println("Welcome to the inheritence quiz!");
		System.out.println(" ");
		System.out.println("Subclass \'School\' extends parent class \'Building\'.");
		System.out.println("School contains these methods:");
		System.out.println("     openDoors(), which returns \"Here come the students\"");
		System.out.println("     changeClasses(), which returns \"Ring, ring\"");
		System.out.println("Building contains these two methods:");
		System.out.println("     openDoors(), which returns \"The doors are open\"");
		System.out.println("     fallDown(), which returns \"Run!\"");
		System.out.println(" ");
	}
	public static void askQuestions()
	{
		int score = 0;
		System.out.println("Answer the questions based on the following:");
		System.out.println("School s = new School();");
		System.out.println("s.openDoors();");
		System.out.println(" ");
		System.out.println("Will this code run? Enter 1 for yes and 2 for no.");
		Scanner userQOne = new Scanner(System.in);
		int QOne = userQOne.nextInt();
			if(QOne == 1)
			{
				System.out.println("Correct!");
				score ++;
			}
			else
			{
				System.out.println("Sorry, this code will run.");
			}
		System.out.println("What will this code output?");
		System.out.println("1. Here come the students");
		System.out.println("2. Ring, ring");
		System.out.println("3. Run!");
		System.out.println("4. The doors are open");
		Scanner userQTwo = new Scanner(System.in);
		int QTwo = userQTwo.nextInt();
		System.out.println("Running...");
		School s = new School();
		s.openDoors();
		if(QTwo == 1)
		{
			System.out.println("Correct!");
			score ++;
		}
		else
		{
			System.out.println("Sorry, you picked the wrong one.");
		}
		
		
		//?3
		System.out.println(" ");
		System.out.println("Answer the questions based on the following:");
		System.out.println("School s = new School();");
		System.out.println("s.fallDown();");
		System.out.println(" ");
		System.out.println("Will this code run? Enter 1 for yes and 2 for no.");
		Scanner userQThree = new Scanner(System.in);
		int QThree = userQThree.nextInt();
			if(QThree == 1)
			{
				System.out.println("Sorry, this will not run.");
			}
			else
			{
				System.out.println("Correct!");
				score ++;
			}
		//?4+5
			System.out.println(" ");
			System.out.println("Answer the questions based on the following:");
			System.out.println("Building s = new School();");
			System.out.println("s.openDoors();");
			System.out.println(" ");
			System.out.println("Will this code run? Enter 1 for yes and 2 for no.");
			Scanner userQFour = new Scanner(System.in);
			int QFour = userQFour.nextInt();
				if(QFour == 1)
				{
					System.out.println("Correct!");
					score ++;
				}
				else
				{
					System.out.println("Sorry, this code will run.");
				}
			System.out.println("What will this code output?");
			System.out.println("1. Here come the students");
			System.out.println("2. Ring, ring");
			System.out.println("3. Run!");
			System.out.println("4. The doors are open");
			Scanner userQFive = new Scanner(System.in);
			int QFive = userQFive.nextInt();
			System.out.println("Running...");
			Building z = new School();
			z.openDoors();
			if(QFive == 1)
			{
				System.out.println("Correct!");
				score ++;
			}
			else
			{
				System.out.println("Sorry, you picked the wrong one.");
			}
		//?6
			System.out.println(" ");
			System.out.println("Answer the questions based on the following:");
			System.out.println("School s = new Building();");
			System.out.println("s.changeClasses();");
			System.out.println(" ");
			System.out.println("Will this code run? Enter 1 for yes and 2 for no.");
			Scanner userQSix = new Scanner(System.in);
			int QSix = userQSix.nextInt();
				if(QSix == 1)
				{
					System.out.println("Sorry, this code will not run.");
				}
				else
				{
					System.out.println("Correct!");
					score ++;
				}
		//?7+8 BAD
				System.out.println(" ");
				System.out.println("Answer the questions based on the following:");
				System.out.println("Building s = new School();");
				System.out.println("s.fallDown();");
				System.out.println(" ");
				System.out.println("Will this code run? Enter 1 for yes and 2 for no.");
				Scanner userQSeven = new Scanner(System.in);
				int QSeven = userQSeven.nextInt();
					if(QSeven == 1)
					{
						System.out.println("Correct!");
						score ++;
					}
					else
					{
						System.out.println("Sorry, this code will run.");
					}
				System.out.println("What will this code output?");
				System.out.println("1. Here come the students");
				System.out.println("2. Ring, ring");
				System.out.println("3. Run!");
				System.out.println("4. The doors are open");
				Scanner userQEight = new Scanner(System.in);
				int QEight = userQEight.nextInt();
				System.out.println("Running...");
				Building y = new School();
				y.fallDown();
				if(QEight == 3)
				{
					System.out.println("Correct!");
					score ++;
				}
				else
				{
					System.out.println("Sorry, you picked the wrong one.");
				}
		//?9
				System.out.println(" ");
				System.out.println("Answer the questions based on the following:");
				System.out.println("School s = new Building(); \n s.changeClasses;");
				System.out.println("Will this code run? Enter 1 for yes and 2 for no.");
				Scanner userQN = new Scanner(System.in);
				int QN = userQN.nextInt();
					if(QN == 1)
					{
						System.out.println("Sorry, that is incorrect.");
					}
					else
					{
						System.out.println("Correct!");
						score ++;
					}
				
		//?10+11
					System.out.println(" ");
				System.out.println("Answer the questions based on the following:");
				System.out.println("Building s = new School();");
				System.out.println("((Building)s).changeClasses();");
				System.out.println(" ");
				System.out.println("Will this code run? Enter 1 for yes and 2 for no.");
				Scanner userQTen = new Scanner(System.in);
				int QTen = userQTen.nextInt();
					if(QTen == 1)
					{
						System.out.println("Correct!");
						score ++;
					}
					else
					{
						System.out.println("Sorry, this code will run.");
					}
				System.out.println("What will this code output?");
				System.out.println("1. Here come the students");
				System.out.println("2. Ring, ring");
				System.out.println("3. Run!");
				System.out.println("4. The doors are open");
				Scanner userQEleven = new Scanner(System.in);
				int QEleven = userQEleven.nextInt();
				System.out.println("Running...");
				Building b = new School();
				((School)b).changeClasses();
				if(QEleven == 2)
				{
					System.out.println("Correct!");
					score ++;
				}
				else
				{
					System.out.println("Sorry, you picked the wrong one.");
				}
			System.out.println("Thanks for playing! You got " + score + " out of 11.");
			
	}

}

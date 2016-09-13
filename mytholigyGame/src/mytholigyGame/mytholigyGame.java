package mytholigyGame;

import java.util.Scanner;

public class mytholigyGame
	{
		static String input;
		static Scanner userInput = new Scanner(System.in);
		static String [][][] board=new String [3][4][5];

		public static void main(String[] args)
			{
				//wannaPlay();
				displayBoard();
				startGame();
			}
		public static void wannaPlay()
			{
				System.out.println("Hello! what is your name?");
				String name= userInput.nextLine();
				System.out.println("hello " + name);
				System.out.println("Would you like to play an awesome mytholigy game? please for yes please type (1) for no please type (2)");
				int yesOrNo= userInput.nextInt();
				if (yesOrNo == 1)
					{
						System.out.println("Awesome!");					
					}
				else 
					{
						System.exit(0);					
					}
			}
		public static void displayBoard()
			{
				for(int flor=0; flor<board.length; flor++)
					{
						for (int row=0; row<board[0].length; row++)
							{
								for(int col=0; col<board[0][0].length; col++)
									{
									board[flor][row][col]="o";							
									}
							}
					}
				//cards = 7 char
				//enemies = 3 char
				//your characters = 5 char
				System.out.println("     1       2       3       4       5");
				System.out.println(" ---------------------------------------------------");
				System.out.println(" |         |         |         |         |         |");
				System.out.println(" |    "+board[0][0][0]+"    |    "+board[0][0][1]+"    |    "+board[0][0][2]+"    |    "+board[0][0][3]+"    |    "+board[0][0][4]+"    |");
				System.out.println("A|    "+board[1][0][0]+"    |    "+board[1][0][1]+"    |    "+board[1][0][2]+"    |    "+board[1][0][3]+"    |    "+board[1][0][4]+"    |");
				System.out.println(" |    "+board[2][0][0]+"    |    "+board[2][0][1]+"    |    "+board[2][0][2]+"    |    "+board[2][0][3]+"    |    "+board[2][0][4]+"    |");
				System.out.println(" |         |         |         |         |         |");
				System.out.println(" ---------------------------------------------------");
				System.out.println(" |         |         |         |         |         |");
				System.out.println(" |    "+board[0][1][0]+"    |    "+board[0][1][1]+"    |    "+board[0][1][2]+"    |    "+board[0][1][3]+"    |    "+board[0][1][4]+"    |");
				System.out.println("B|    "+board[1][1][0]+"    |    "+board[1][1][1]+"    |    "+board[1][1][2]+"    |    "+board[1][1][3]+"    |    "+board[1][1][4]+"    |");
				System.out.println(" |    "+board[2][1][0]+"    |    "+board[2][1][1]+"    |    "+board[2][1][2]+"    |    "+board[2][1][3]+"    |    "+board[2][1][4]+"    |");
				System.out.println(" |         |         |         |         |         |");
				System.out.println(" ---------------------------------------------------");
				System.out.println(" |         |         |         |         |         |");
				System.out.println(" |    "+board[0][2][0]+"    |    "+board[0][2][1]+"    |    "+board[0][2][2]+"    |    "+board[0][2][3]+"    |    "+board[0][2][4]+"    |");
				System.out.println("C|    "+board[1][2][0]+"    |    "+board[1][2][1]+"    |    "+board[1][2][2]+"    |    "+board[1][2][3]+"    |    "+board[1][2][4]+"    |");
				System.out.println(" |    "+board[2][2][0]+"    |    "+board[2][2][1]+"    |    "+board[2][2][2]+"    |    "+board[2][2][3]+"    |    "+board[2][2][4]+"    |");
				System.out.println(" |         |         |         |         |         |");
				System.out.println(" ---------------------------------------------------");
				System.out.println(" |         |         |         |         |         |");
				System.out.println(" |    "+board[0][3][0]+"    |    "+board[0][3][1]+"    |    "+board[0][3][2]+"    |    "+board[0][3][3]+"    |    "+board[0][3][4]+"    |");
				System.out.println("D|    "+board[1][3][0]+"    |    "+board[1][3][1]+"    |    "+board[1][3][2]+"    |    "+board[1][3][3]+"    |    "+board[1][3][4]+"    |");
				System.out.println(" |    "+board[2][3][0]+"    |    "+board[2][3][1]+"    |    "+board[2][3][2]+"    |    "+board[2][3][3]+"    |    "+board[2][3][4]+"    |");
				System.out.println(" |         |         |         |         |         |");
				System.out.println(" ---------------------------------------------------");
			}
		public static void startGame()
			{
			
			}

	}
